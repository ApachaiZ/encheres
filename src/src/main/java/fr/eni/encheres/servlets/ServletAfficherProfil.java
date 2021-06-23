package fr.eni.encheres.servlets;

import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletAfficherProfil", value = "/servletAfficherProfil")
public class ServletAfficherProfil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        try{
        String pseudo =request.getParameter("pseudo");
        Utilisateur utilisateur = null;
        UtilisateurManager utilisateurManager = new UtilisateurManager();
        Utilisateur autreProfil = utilisateurManager.afficherProfil(pseudo);

        request.setAttribute("pseudoProfil", autreProfil.getPseudo());
        request.setAttribute("nomProfil", autreProfil.getNom());
        request.setAttribute("prenomProfil", autreProfil.getPrenom());
        request.setAttribute("emailProfil", autreProfil.getEmail());
        request.setAttribute("telephoneProfil", autreProfil.getTelephone());
        request.setAttribute("rueProfil", autreProfil.getRue());
        request.setAttribute("codePostalProfil", autreProfil.getCodePostal());
        request.setAttribute("villeProfil", autreProfil.getVille());
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/AfficherProfil.jsp");
        rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}