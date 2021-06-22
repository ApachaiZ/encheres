package fr.eni.encheres.servlets.redirection;

import fr.eni.encheres.bll.CreerCompteManager;
import fr.eni.encheres.bo.Utilisateur;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ServletOpenCreerCompte", value="/servletOpenCreerCompte")
public class ServletOpenCreerCompte extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletOpenCreerCompte() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/creerCompte.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
