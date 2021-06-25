package fr.eni.encheres.servlets.redirection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Accueil", value = "/accueil")
public class ServletOpenAccueil extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession(false) == null) {
            request.setAttribute("codeco", "Connexion");
            request.setAttribute("servletCodeco", "servletOpenConnexion");
        } else {
            request.setAttribute("codeco", "Deconnexion");
            request.setAttribute("servletCodeco", "servletOpenDeconnexion");
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}


