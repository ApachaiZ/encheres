package fr.eni.encheres.dal.dao;

public abstract class DAOFactory {

    public static UtilisateurDAO getCreerCompteDAO() {
        return new UtilisateurDAOjdbcImpl();
    }
}


