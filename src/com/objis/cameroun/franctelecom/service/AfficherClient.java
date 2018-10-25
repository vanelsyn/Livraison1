package com.objis.cameroun.franctelecom.service;

import com.objis.cameroun.franctelecom.domaine.Clients;

public class AfficherClient {
	
	public void AfficherClientMethod(Clients clients) {
				
		System.out.println("LES INFORMATIONS QUE VOUS VENEZ D'ENREGISTRER SONT LES SUIVANTES : \n"
				+ "NOM : " + clients.getNomClient() + "\n"
						+ "PRENOM : " + clients.getPrenomClient() + "\n"
								+ "NUMERO TELEPHONE : " + clients.getTelephoneClient() + "\n"
								+ "ADRESSE RESIDENCE : " + clients.getAdresseResidenceClient() + "\n"
								+ "NUMERO CARTE DE CREDIT : " + clients.getNumeroCarteCreditClient() + "\n"
								+ "NUMERO MOBILE MONEY : " + clients.getNumeroMobileMoneyClient() + "\n"
								+ "PAYS RESIDENCE : " + clients.getPaysResidenceClient() + "\n"
								+ "PAYS LIVRAISON : " + clients.getPaysLivraisonClient() + "\n"
								+ "VILLE RESIDENCE : " + clients.getVilleResidenceClient() + "\n"
								+ "VILLE LIVRAISON : " + clients.getVilleLivraisonClient()
						);
		
	}

}
