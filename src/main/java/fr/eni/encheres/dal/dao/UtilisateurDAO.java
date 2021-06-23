package fr.eni.encheres.dal.dao;

import fr.eni.encheres.bo.Utilisateur;

public interface UtilisateurDAO {
    Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue,
                               String code_postal, String ville, String mot_de_passe, int credit, Boolean administrateur);

    Utilisateur select(String pseudo,String mot_de_passe);

    Utilisateur afficher(String pseudo);
}
