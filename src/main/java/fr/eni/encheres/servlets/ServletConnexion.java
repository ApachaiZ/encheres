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

@WebServlet(name = "ServletConnexion", value = "/servletConnexion")
public class ServletConnexion extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/connexion.jsp");// Verifier adresse du path
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        try{
            String pseudo = request.getParameter("pseudo");
            String mot_de_passe = request.getParameter("mot_de_passe");
            UtilisateurManager utilisateurConnexion = new UtilisateurManager();
            Utilisateur utilisateur = utilisateurConnexion.select(pseudo, mot_de_passe);
            if (utilisateur.getEmail() != null) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/success.jsp");
                requestDispatcher.forward(request, response);
            }
            else {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/error.jsp");
                requestDispatcher.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}