package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.dao.UtilisateurDAO;
import fr.eni.encheres.dal.dao.DAOFactory;

public class UtilisateurManager {

    private UtilisateurDAO utilisateurDAO;

    public UtilisateurManager() {
        utilisateurDAO = DAOFactory.getUtilisateurDAO();
    }

    public Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal, String ville, String mot_de_passe, int credit, Boolean administrateur) {
        //UtilisateurManager utilsateurDAO = null;
        return utilisateurDAO.inserer(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur);
    }

    public Utilisateur afficherProfil(String pseudo) {
        //UtilisateurManager utilisateurDAO = null;
        return utilisateurDAO.afficherProfil(pseudo);
    }

}
