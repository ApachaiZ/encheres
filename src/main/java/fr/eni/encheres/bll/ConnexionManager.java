package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.dao.DAOFactory;
import fr.eni.encheres.dal.dao.UtilisateurDAO;

public class ConnexionManager {
    private final UtilisateurDAO utilisateurDAO;

    public ConnexionManager() {
        utilisateurDAO = DAOFactory.getConnexionDAO();
    }

    public Utilisateur select(String pseudo, String mot_de_passe) {
        return utilisateurDAO.select(pseudo, mot_de_passe);
    }
}
