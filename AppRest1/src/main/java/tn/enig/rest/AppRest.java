package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IMagasinDao;
import tn.enig.dao.IProduitDao;
import tn.enig.model.Magasin;
import tn.enig.model.Produit;


@RestController
public class AppRest {
	
	@Autowired
	IProduitDao daop;
	@Autowired
	IMagasinDao daom;
	
	public void setDaop(IProduitDao daop) {
		this.daop = daop;
	}
	
	public void setDaom(IMagasinDao daom) {
		this.daom = daom;
	}
	
	@GetMapping("/getallproduit")
	public List<Produit> getp(){
		return daop.findAll();
	}
	@DeleteMapping("/deleteproduit/{idp}")
	public void deletep(@PathVariable int idp){
		 daop.deleteById(idp);
	}

	@PostMapping("/addproduit")
	public void addp(@RequestBody Produit p) {
		daop.save(p);
	}
	
	@PostMapping("/addmagasin")
	public void addm(@RequestBody Magasin m) {
		daom.save(m);
	}
	
}
