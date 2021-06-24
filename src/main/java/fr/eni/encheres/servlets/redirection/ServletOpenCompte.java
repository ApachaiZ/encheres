package fr.eni.encheres.servlets.redirection;

import fr.eni.encheres.bo.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletOpenCompte", value = "/servletOpenCompte")
public class ServletOpenCompte extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletOpenCompte() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(); //Je recupere la session
        Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur");
        request.setAttribute("utilisateur", utilisateur);
        this.getServletContext().getRequestDispatcher("/WEB-INF/monProfil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}
