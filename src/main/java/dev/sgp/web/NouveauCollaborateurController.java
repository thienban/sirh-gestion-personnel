package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/nouveau")
public class NouveauCollaborateurController extends HttpServlet {

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// utilisation du service
		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp").forward(req, resp);
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			//String dateNaissance = req.getParameter("dateNaissance");
			String adresse = req.getParameter("adresse");
			String numeroSecurite = req.getParameter("numeroSecurite");
			StringBuffer message = new StringBuffer ("Les champs suivants ne sont pas remplis : ");
			
			ArrayList<String> missing = new ArrayList<>();   
			
			if (nom == null || nom.equals("")){
				missing.add("nom");
			}
			if (prenom == null || prenom.equals("")){
				missing.add("prenom");
			}
			if (dateNaissance == null || dateNaissance.equals("")){
				missing.add("dateNaissance");
			}
			if ( adresse == null || adresse.equals("")){
				missing.add("adresse");
			}
			if ( numeroSecurite.equals("") || numeroSecurite.length() != 15){
				missing.add("numeroSecurite");
			}
			resp.setContentType("text/html");
						
			if (missing.size() > 0) {
				for (String m : missing) {
				message.append(m).append(", ");	
				}
				resp.sendError(400, message.toString());
			} else {
				//création un collaborateur
				String matricule = (nom + prenom.charAt(0)).toUpperCase();
				String email = nom + "." + prenom + "@societe.com";//Todo externaliser 
				String photo = "yeah";
				
				System.out.println(matricule);
				System.out.println(email);
				System.out.println(dateNaissance);
				
				
				Collaborateur collaborateur = new Collaborateur ();
				collaborateur.setNom(nom);
				collaborateur.setPrenom(prenom);
				collaborateur.setDate_naissance(dateNaissance);
				collaborateur.setAdresse(adresse);
				collaborateur.setNum_secu_sociale(numeroSecurite);
				collaborateur.setEmailPro(email);
				
				
				resp.setContentType("text/html");
				resp.getWriter().write("<h1>Nouveau collaborateurs</h1>" + "<ul>" + "<li>Matricule=" + matricule + "</li>"
								+ "<li>Nom=" + nom + "</li>" + "<li>Prenom=" + prenom
								+ "</li>Date de Naissance : " + dateNaissance + "</ul>");
				//sauvergarder dans la liste
				collabService.sauvegarderCollaborateur(collaborateur);
				//redirection lister.jsp
				resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
			}
			
			
		
			
	}
	
}