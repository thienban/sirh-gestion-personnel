package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate date_naissance;
	private String adresse;
	private String num_secu_sociale;
	private String emailPro;
	private String photo;
	private String intitulePoste;
	private Departement departement;
	private ZonedDateTime dateHeureCreation;
	public Boolean actif;
	private String phone;
	private String banque;
	private String bic;
	private String iban;

	public Collaborateur() {
		this.actif = true;
		this.dateHeureCreation = ZonedDateTime.now();
		this.photo = "default-avatar.png";
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNum_secu_sociale() {
		return num_secu_sociale;
	}

	public void setNum_secu_sociale(String num_secu_sociale) {
		this.num_secu_sociale = num_secu_sociale;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean isActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Boolean getActif() {
		return actif;
	}
}