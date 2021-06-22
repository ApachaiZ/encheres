package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.dao.UtilisateurDAO;
import fr.eni.encheres.dal.dao.DAOFactory;

public class CreerCompteManager {
    private UtilisateurDAO creerCompteDAO;

    public CreerCompteManager() {
        creerCompteDAO = DAOFactory.getCreerCompteDAO();
    }

    public Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal, String ville, String mot_de_passe, int credit, Boolean administrateur) {
        return creerCompteDAO.inserer(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur);
    }
}
