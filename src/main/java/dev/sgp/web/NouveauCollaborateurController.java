package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

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
			String dateNaissance = req.getParameter("dateNaissance");
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
				resp.setContentType("text/html");
				resp.getWriter().write("<h1>Nouveau collaborateurs<h1>");
				/*resp.setContentType("text/html");
				resp.getWriter().write("<h1>Edition des collaborateurs</h1>" + "<ul>" + "<li>Matricule=" + nom + "</li>"
								+ "<li>Titre="  "</li>" + "<li>Nom=" "</li>" + "<li>Prenom=" + prenom
								+ "</li>" + "</ul>");*/
			}
	}
	
}