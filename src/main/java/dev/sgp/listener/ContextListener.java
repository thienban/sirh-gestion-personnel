package dev.sgp.listener;

import java.time.LocalDate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

@WebListener
public class ContextListener implements ServletContextListener {
	private DepartementService departementService = Constantes.DEPT_SERVICE;
	private CollaborateurService collaborateurService = Constantes.COLLAB_SERVICE;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		departementService.ajouterDepartement(new Departement(1, "Comptabilité"));
		departementService.ajouterDepartement(new Departement(2, "Informatique"));
		departementService.ajouterDepartement(new Departement(3, "Ressources Humaines"));
		departementService.ajouterDepartement(new Departement(4, "Direction"));
		// création de collaborateur
		Collaborateur collaborateur = new Collaborateur ("Dupont", "Thierry", LocalDate.now().minusYears(40), "20 rue Marcelin Antoine", "123456789123456","Comptable", departementService.listerDepartements().get(0));
		Collaborateur collaborateur1 = new Collaborateur ("Fabrio", "Alex", LocalDate.now().minusYears(34), "20 rue Antoine de France", "123456789123456","Developppeur", departementService.listerDepartements().get(1));
		Collaborateur collaborateur2 = new Collaborateur ("Mito", "Melanie", LocalDate.now().minusYears(36), "20 rue Marcel François", "123456789123456","Recruteur", departementService.listerDepartements().get(2));
		Collaborateur collaborateur3 = new Collaborateur ("Mika", "Henry", LocalDate.now().minusYears(38), "20 rue Rio de France", "123456789123456","Chef d'équipe", departementService.listerDepartements().get(3));
		//sauvegarder
		collaborateurService.sauvegarderCollaborateur(collaborateur);
		collaborateurService.sauvegarderCollaborateur(collaborateur1); 
		collaborateurService.sauvegarderCollaborateur(collaborateur2); 
		collaborateurService.sauvegarderCollaborateur(collaborateur3); 
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("The application stopped");
	}
}
