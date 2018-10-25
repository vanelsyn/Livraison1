package com.objis.cameroun.franctelecom.presentation;

import java.util.Scanner;

import com.objis.cameroun.franctelecom.domaine.Clients;
import com.objis.cameroun.franctelecom.domaine.Produits;
import com.objis.cameroun.franctelecom.service.AcheterProduits;
import com.objis.cameroun.franctelecom.service.CategorieProduits;
import com.objis.cameroun.franctelecom.service.DetailsProduits;
import com.objis.cameroun.franctelecom.service.AfficherClient;

/**
 * @author ventachat
 *
 */
public class FrancTelecom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Message d'acceuil
		System.out.println("*** BIENVENUE DANS MON APPLICATION DE VENTE EN LIGNE : FRANC-TELECOM ***");
		System.out.println();
		
		//Création des objets 'scanClient', 'scanCategorie', 'scanProduit', 'scanCommande', 'scanOperation', 'scanReponse' de type scanner
		/*Scanner scanProduit = new Scanner(System.in);
		Scanner scanCategorie = new Scanner(System.in);
		Scanner scanProduit = new Scanner(System.in);
		Scanner scanCommande = new Scanner(System.in);
		Scanner scanReponse = new Scanner(System.in);*/
		Scanner scanOperation = new Scanner(System.in);
		Scanner scanClient = new Scanner(System.in);
		
		
		char choixOperation;
		char choixReponse = ' ';
		
		String client;
		String categorieProduit;
		String produit;
		String commande;
		
		//String idClient;
	    String nomClient;
	    String prenomClient;
	    String emailClient;
	    String telephoneClient;
	    //String motPassClient;
	    String adresseResidenceClient;
	    String adresseLivraisonClient;
	    String numeroCarteCreditClient;
	    String numeroMobileMoneyClient;
	    String paysResidenceClient;
	    String paysLivraisonClient;
	    String villeResidenceClient;
	    String villeLivraisonClient;
		
		/*//Instanciation
		Produits produire = new Produits();
		Clients clientele = new Clients();
		CategorieProduits categoriser = new CategorieProduits();
		EnregistrerProduits enregistrer = new EnregistrerProduits();
		DetailsProduits detailler = new DetailsProduits();
		AcheterProduits acheter = new AcheterProduits();*/
		
		System.out.println("VEUILLEZ-VOUS ENRGISTRER SVP... : \n"
				+ " \n"
				+ "VEUILLEZ ENTRER VOTRE NOM : ");
				nomClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE NOM : ");
				prenomClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE PRENOM : ");
				emailClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE NUMERO DE TELEPHONE : ");
				telephoneClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE ADRESSE DE RESIDENCE : ");
				adresseResidenceClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE ADRESSE DE LIVRAISON : ");
				adresseLivraisonClient = scanClient.nextLine();
				System.out.println("VEUILLEZ FOURNIR VOTRE NUMERO CARTE DE CREDIT : ");
				numeroCarteCreditClient = scanClient.nextLine();
				System.out.println("VEUILLEZ FOURNIR VOTRE NUMERO MOBILE MONEY : ");
				numeroMobileMoneyClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE PAYS DE RESIDENCE : ");
				paysResidenceClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE PAYS DE LIVRAISON : ");
				paysLivraisonClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE VILLE DE RESIDENCE : ");
				villeResidenceClient = scanClient.nextLine();
				System.out.println("VEUILLEZ ENTRER VOTRE VILLE DE LIVRAISON : ");
				villeLivraisonClient = scanClient.nextLine();
				
				Clients clients = new Clients(nomClient, prenomClient, emailClient, telephoneClient, adresseResidenceClient, adresseLivraisonClient, numeroCarteCreditClient, numeroMobileMoneyClient, paysResidenceClient, paysLivraisonClient, villeResidenceClient, villeLivraisonClient);
				AfficherClient afficherClient = new AfficherClient();
				afficherClient.AfficherClientMethod(clients);
		System.out.println();
		System.out.println("VEUILLEZ CHOISIR UNE DES OPERATIONS CI-DESSOUS : ");
		System.out.println();
		//System.out.println("... 0° ENREGISTREMENT DE PRODUITS ");
		System.out.println("... 1° LISTE DES PRODUITS ");
		System.out.println("... 2° ACHAT DE PRODUITS ");
		//System.out.println("... 3° DETAILS DES PRODUITS ");
		System.out.println();
		
		//while ((choixReponse =='O') || (choixReponse =='o')){}
		
		choixOperation = scanOperation.nextLine().charAt(0);
		
		switch (choixOperation){
				//Affiche les produits
				case '1':{
					System.out.println("VOUS DESIREZ VOIR LA LISTE DES PRODUITS... ");
					CategorieProduits categorieProduits = new CategorieProduits();
					categorieProduits.CategorieProduitsMethod();					
				break;
				}
				
				//Validation d'une commande d'un client
				case '2':{
					System.out.println("VOUS SOUHAITEZ ACHETER UN(DES) PRODUIT(S)... ");
					
				
				break;
				}
		
		}		
	}

}
