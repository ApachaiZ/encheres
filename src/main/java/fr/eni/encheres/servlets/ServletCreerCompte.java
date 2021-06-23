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

@WebServlet(name="ServletCreerCompte", value="/servletCreerCompte")
public class ServletCreerCompte extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletCreerCompte() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/creerCompte.jsp");// Verifier adresse du path
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        try{
            String pseudo = request.getParameter("pseudo");
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String telephone = request.getParameter("telephone");
            String rue = request.getParameter("rue");
            String code_postal = request.getParameter("code_postal");
            String ville = request.getParameter("ville");
            String mot_de_passe = request.getParameter("mot_de_passe");

            UtilisateurManager utilisateurManager = new UtilisateurManager();
            Utilisateur utilisateur = utilisateurManager.inserer(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, 0, false);
            request.setAttribute("utilisateur", utilisateur);

        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/accueil.jsp");// Verifier adresse du path
        requestDispatcher.forward(request, response);
        }
}
