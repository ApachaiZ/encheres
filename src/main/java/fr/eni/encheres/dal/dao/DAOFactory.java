package fr.eni.encheres.dal.dao;

public abstract class DAOFactory {

    public static CreerCompteDAO getCreerCompteDAO() {
        return new CreerCompteDAOJdbcImpl();
    }
}


