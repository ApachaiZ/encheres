package fr.eni.encheres.servlets;

import fr.eni.encheres.dal.jdbc.ConnectionProvider;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "ServletTestConnexion", value = "/ServletTestConnexion")
public class ServletTestConnexion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection con = null;
        try {
            con = ConnectionProvider.getConnection();
            con.close();
            System.out.println("Got it!");
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
