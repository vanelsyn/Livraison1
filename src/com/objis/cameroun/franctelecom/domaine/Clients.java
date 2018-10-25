package com.objis.cameroun.franctelecom.domaine;

/**
 * @author ventachat
 *
 */
public class Clients {
	//Déclaration des attributs de la classe 'Clients'
	//private String idClient;
    private String nomClient;
    private String prenomClient;
    private String emailClient;
    private String telephoneClient;
    //private String motPassClient;
    private String adresseResidenceClient;
    private String adresseLivraisonClient;
    private String numeroCarteCreditClient;
    private String numeroMobileMoneyClient;
    private String paysResidenceClient;
    private String paysLivraisonClient;
    private String villeResidenceClient;
    private String villeLivraisonClient;
        
    //Création du constructeur 'Clients()'
	public Clients() {
		// TODO Auto-generated constructor stub
	}

	public Clients(String nomClient, String prenomClient, String emailClient, String telephoneClient,
			String adresseResidenceClient, String adresseLivraisonClient, String numeroCarteCreditClient,
			String numeroMobileMoneyClient, String paysResidenceClient, String paysLivraisonClient,
			String villeResidenceClient, String villeLivraisonClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.telephoneClient = telephoneClient;
		this.adresseResidenceClient = adresseResidenceClient;
		this.adresseLivraisonClient = adresseLivraisonClient;
		this.numeroCarteCreditClient = numeroCarteCreditClient;
		this.numeroMobileMoneyClient = numeroMobileMoneyClient;
		this.paysResidenceClient = paysResidenceClient;
		this.paysLivraisonClient = paysLivraisonClient;
		this.villeResidenceClient = villeResidenceClient;
		this.villeLivraisonClient = villeLivraisonClient;
	}
	
	//Génération des getters/setters de chaque attribut de la classe 'Clients'	
	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getTelephoneClient() {
		return telephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {
		this.telephoneClient = telephoneClient;
	}

	public String getAdresseResidenceClient() {
		return adresseResidenceClient;
	}

	public void setAdresseResidenceClient(String adresseResidenceClient) {
		this.adresseResidenceClient = adresseResidenceClient;
	}

	public String getAdresseLivraisonClient() {
		return adresseLivraisonClient;
	}

	public void setAdresseLivraisonClient(String adresseLivraisonClient) {
		this.adresseLivraisonClient = adresseLivraisonClient;
	}

	public String getNumeroCarteCreditClient() {
		return numeroCarteCreditClient;
	}

	public void setNumeroCarteCreditClient(String numeroCarteCreditClient) {
		this.numeroCarteCreditClient = numeroCarteCreditClient;
	}

	public String getNumeroMobileMoneyClient() {
		return numeroMobileMoneyClient;
	}

	public void setNumeroMobileMoneyClient(String numeroMobileMoneyClient) {
		this.numeroMobileMoneyClient = numeroMobileMoneyClient;
	}

	public String getPaysResidenceClient() {
		return paysResidenceClient;
	}

	public void setPaysResidenceClient(String paysResidenceClient) {
		this.paysResidenceClient = paysResidenceClient;
	}

	public String getPaysLivraisonClient() {
		return paysLivraisonClient;
	}

	public void setPaysLivraisonClient(String paysLivraisonClient) {
		this.paysLivraisonClient = paysLivraisonClient;
	}

	public String getVilleResidenceClient() {
		return villeResidenceClient;
	}

	public void setVilleResidenceClient(String villeResidenceClient) {
		this.villeResidenceClient = villeResidenceClient;
	}

	public String getVilleLivraisonClient() {
		return villeLivraisonClient;
	}

	public void setVilleLivraisonClient(String villeLivraisonClient) {
		this.villeLivraisonClient = villeLivraisonClient;
	}
	
	//Génération de la méthode 'toString()' de la classe 'Clients'	
	@Override
	public String toString() {
		return "Clients [nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", emailClient=" + emailClient
				+ ", telephoneClient=" + telephoneClient + ", adresseResidenceClient=" + adresseResidenceClient
				+ ", adresseLivraisonClient=" + adresseLivraisonClient + ", numeroCarteCreditClient="
				+ numeroCarteCreditClient + ", numeroMobileMoneyClient=" + numeroMobileMoneyClient
				+ ", paysResidenceClient=" + paysResidenceClient + ", paysLivraisonClient=" + paysLivraisonClient
				+ ", villeResidenceClient=" + villeResidenceClient + ", villeLivraisonClient=" + villeLivraisonClient
				+ "]";
	}
	
}
