package com.objis.cameroun.franctelecom.service;

import com.objis.cameroun.franctelecom.domaine.Produits;

public class DetailsProduits {
	//Déclaration des attributs de la classe 'Détails des Produits'
	private Produits produit;
	private String dateFabrication;
	private String datePeremption;
	private String paysFabrication;
	private String nomFabricant;
	
	//Création du constructeur 'DetailsProduits()'
	public DetailsProduits(Produits produit, String dateFabrication, String datePeremption, String paysFabrication,
			String nomFabricant) {
		super();
		this.produit = produit;
		this.dateFabrication = dateFabrication;
		this.datePeremption = datePeremption;
		this.paysFabrication = paysFabrication;
		this.nomFabricant = nomFabricant;
	}
	
	public DetailsProduits() {
		// TODO Auto-generated constructor stub
	}

	//Génération des getters/setters de chaque attribut de la classe 'DetailsProduits'
	public Produits getProduit() {
		return produit;
	}
	public void setProduit(Produits produit) {
		this.produit = produit;
	}

	public String getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(String dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
	
	public String getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(String datePeremption) {
		this.datePeremption = datePeremption;
	}
	
	public String getPaysFabrication() {
		return paysFabrication;
	}
	public void setPaysFabrication(String paysFabrication) {
		this.paysFabrication = paysFabrication;
	}
	
	public String getNomFabricant() {
		return nomFabricant;
	}
	public void setNomFabricant(String nomFabricant) {
		this.nomFabricant = nomFabricant;
	}
	
	//Génération de la méthode 'toString()' de la classe 'DetailsProduits'
	@Override
	public String toString() {
		return "DetailsProduits [produit=" + produit + ", dateFabrication=" + dateFabrication + ", datePeremption="
				+ datePeremption + ", paysFabrication=" + paysFabrication + ", nomFabricant=" + nomFabricant + "]";
	}
	
}
