package com.oussama.produits.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produit;
	private String nom_produit;
	private Double prix_produit;
	private Date date_creation;
	
	public Produit() {
		super();
		}
		public Produit(Date date_creation,String nom_produit, Double prix_produit) {
		super();
		this.nom_produit = nom_produit;
		this.prix_produit = prix_produit;
		this.date_creation = date_creation;
		}
		
		public Long getIdProduit() {
			return id_produit;
			}
		
		public void setIdProduit(Long id_produit) {
			this.id_produit = id_produit;
			}
			
		public String getNomProduit() {
			return nom_produit;
			}
			
		public void setNomProduit(String nom_produit) {
			this.nom_produit = nom_produit;
			}
		
		public Double getPrixProduit() {
			return prix_produit;
			}
		
		public void setPrixProduit(Double prix_produit) {
			this.prix_produit = prix_produit;
			}
			
			public Date getDateCreation() {
			return date_creation;
			}
			
			public void setDateCreation(Date date_creation) {
			this.date_creation = date_creation;
			}
			
			@Override
			public String toString() {
			return "Produit [ id produit = " + id_produit + ", nom produit = " + nom_produit + ", prix produit = " + prix_produit
			+ ", date creation=" + date_creation + "]";
			}
		
		
}
