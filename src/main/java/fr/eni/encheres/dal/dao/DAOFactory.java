package fr.eni.encheres.dal.dao;

public abstract class DAOFactory {
    public static UtilisateurDAO getUtilisateurDAO() {
        return new UtilisateurDAOJdbcImpl();
    }
}


