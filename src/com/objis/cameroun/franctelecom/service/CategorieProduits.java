package com.objis.cameroun.franctelecom.service;

import java.util.Scanner;

/**
 * @author ventachat
 *
 */
public class CategorieProduits {
	
	char choixCategorie;
	Scanner scanCategorie = new Scanner(System.in);
	
    public void CategorieProduitsMethod() {
    	System.out.println("VEUILLEZ CHOISIR UNE CATEGORIE : \n"
    			+ "1° INFORMATIQUE... \n"
    			+ "2° ALIMENTATION...\n"
    			+ "3° TELEPHONIE...");
    	
    	choixCategorie = scanCategorie.nextLine().charAt(0);
    	
    	switch (choixCategorie){
		
		case '1':{
			System.out.println("VOUS AVEZ CHOISI LA CATEGORIE 'INFORMATIQUE'... \n");
			System.out.println("ORDINATEURS PORTABLES \n"
					+ "DISQUES DURS");			
		break;
		}
		
		case '2':{
			System.out.println("VOUS AVEZ CHOISI LA CATEGORIE 'ALIMENTATION'... \n");
			System.out.println("LAITS \n"
					+ "CUISINE");
		
		break;
		}
		
		case '3':{
			System.out.println("VOUS AVEZ CHOISI LA CATEGORIE 'TELEPHONIE'... \n");
			System.out.println("TELEPHONES PORTABLES \n"
					+ "TELEPHONES FIXES");
		
		break;
		}
    }
  }
}
