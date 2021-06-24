package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.dao.DAOFactory;
import fr.eni.encheres.dal.dao.UtilisateurDAO;

public class UtilisateurManager {
    private final UtilisateurDAO utilisateurDAO;

    public UtilisateurManager() {
        utilisateurDAO = DAOFactory.getUtilisateurDAO();
    }

    public Utilisateur select(String pseudo, String mot_de_passe) {
        return utilisateurDAO.select(pseudo, mot_de_passe);
    }

    public Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal, String ville, String mot_de_passe, int credit, Boolean administrateur) {
        return utilisateurDAO.inserer(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur);
    }

    public Utilisateur afficher(String pseudo) {
        return utilisateurDAO.afficher(pseudo);
    }

    public void supprimerUtilisateur(String pseudo, String mot_de_passe) {
        utilisateurDAO.supprimerUtilisateur(pseudo, mot_de_passe);
    }
}
