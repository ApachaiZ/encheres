package fr.eni.encheres.servlets;


import fr.eni.encheres.bll.ConnexionManager;
import fr.eni.encheres.bo.Utilisateur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
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
            ConnexionManager connexionManager = new ConnexionManager();
            Utilisateur utilisateur = connexionManager.select(pseudo, mot_de_passe);
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