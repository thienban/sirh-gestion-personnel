package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class DepartementService {
	List<Departement> departements = new ArrayList<>();
	public List<Departement> listerDepartements() {
	return departements;}
	public DepartementService() {
		departements.add(new Departement(1, "Comptabilité"));
		departements.add(new Departement(2, "Informatique"));
		departements.add(new Departement(3, "Ressources Humaines"));
		departements.add(new Departement(4, "Direction"));
	}
	
}
