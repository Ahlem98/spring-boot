package tn.enig.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Magasin {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idm;
	String nom;
	String lieu;
		
	
	public Magasin() {
		super();
	}
	public Magasin(String nom, String lieu) {
		super();
		this.nom = nom;
		this.lieu = lieu;
	}
	public Integer getIdm() {
		return idm;
	}
	public void setIdm(Integer idm) {
		this.idm = idm;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
