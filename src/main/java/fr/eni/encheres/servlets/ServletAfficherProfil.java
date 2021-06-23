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
            UtilisateurManager utilisateurManager = new UtilisateurManager();
            Utilisateur utilisateur = utilisateurManager.afficher(pseudo);

            request.setAttribute("pseudoProfil", utilisateur.getPseudo());
            request.setAttribute("nomProfil", utilisateur.getNom());
            request.setAttribute("prenomProfil", utilisateur.getPrenom());
            request.setAttribute("emailProfil", utilisateur.getEmail());
            request.setAttribute("telephoneProfil", utilisateur.getTelephone());
            request.setAttribute("rueProfil", utilisateur.getRue());
            request.setAttribute("codePostalProfil", utilisateur.getCodePostal());
            request.setAttribute("villeProfil", utilisateur.getVille());
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/afficherProfil.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}