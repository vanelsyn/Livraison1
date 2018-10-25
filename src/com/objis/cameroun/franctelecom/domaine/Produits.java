package com.objis.cameroun.franctelecom.domaine;

import com.objis.cameroun.franctelecom.service.CategorieProduits;

/**
 * @author ventachat
 *
 */
public class Produits {
	//Déclaration des attributs de la classe 'Categorie de Produits'
	private String refProduit;
    private String nomProduit;
    private String descriptionProduit;
    private String imageProduit;
    private CategorieProduits categorie;
    private String typeProduit;
    private double prixProduit;
    private boolean disponibiliteProduit;
    private int quantiteProduit;
    
    //Création du constructeur 'Produits()'    
    public Produits(String refProduit, String nomProduit, String descriptionProduit, String imageProduit,
			CategorieProduits categorie, String typeProduit, double prixProduit, boolean disponibiliteProduit,
			int quantiteProduit) {
		super();
		this.refProduit = refProduit;
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.imageProduit = imageProduit;
		this.categorie = categorie;
		this.typeProduit = typeProduit;
		this.prixProduit = prixProduit;
		this.disponibiliteProduit = disponibiliteProduit;
		this.quantiteProduit = quantiteProduit;
	}
   
	public Produits() {
		// TODO Auto-generated constructor stub
	}

	//Génération des getters/setters de chaque attribut de la classe 'Categorie de Produits'
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public String getDescriptionProduit() {
		return descriptionProduit;
	}
	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}
	
	public String getImageProduit() {
		return imageProduit;
	}
	public void setImageProduit(String imageProduit) {
		this.imageProduit = imageProduit;
	}
	
	public CategorieProduits getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieProduits categorie) {
		this.categorie = categorie;
	}
	
	public String getTypeProduit() {
		return typeProduit;
	}
	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}
	
	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	
	public boolean isDisponibiliteProduit() {
		return disponibiliteProduit;
	}
	public void setDisponibiliteProduit(boolean disponibiliteProduit) {
		this.disponibiliteProduit = disponibiliteProduit;
	}
	
	public int getQuantiteProduit() {
		return quantiteProduit;
	}
	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	
	  
	@Override
	public String toString() {
		return "Produits [refProduit=" + refProduit + ", nomProduit=" + nomProduit + ", descriptionProduit="
				+ descriptionProduit + ", imageProduit=" + imageProduit + ", categorie=" + categorie + ", typeProduit="
				+ typeProduit + ", prixProduit=" + prixProduit + ", disponibiliteProduit=" + disponibiliteProduit
				+ ", quantiteProduit=" + quantiteProduit + "]";
	}	
	
}
