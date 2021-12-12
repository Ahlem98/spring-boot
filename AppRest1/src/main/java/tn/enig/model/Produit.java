package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idp;
	String description;
	String quantite;
    float pachat;
    float pvente;
    @ManyToOne
    @JoinColumn(name="idm")
    private Magasin magasin;
  
   
	public Produit(String description, String quantite, float pachat, float pvente,Magasin magasin) {
		super();
		this.description = description;
		this.quantite = quantite;
		this.pachat = pachat;
		this.pvente = pvente;
		this.magasin=magasin;

	}
	
	public Produit() {
		super();
	}

	public Integer getIdp() {
		return idp;
	}
	public void setIdp(Integer idp) {
		this.idp = idp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public float getPachat() {
		return pachat;
	}
	public void setPachat(float pachat) {
		this.pachat = pachat;
	}
	public float getPvente() {
		return pvente;
	}
	public void setPvente(float pvente) {
		this.pvente = pvente;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
    
}
