package fr.eni.encheres.servlets;

import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "servletSupprimerProfil", value = "/servletSupprimerProfil")
public class ServletSupprimerProfil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur");
        UtilisateurManager utilisateurManager = new UtilisateurManager();
        utilisateurManager.supprimerUtilisateur(utilisateur.getPseudo(), utilisateur.getMotDePasse());
        response.sendRedirect("accueil");
    }
}
