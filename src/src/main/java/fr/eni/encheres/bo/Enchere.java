package fr.eni.encheres.bo;

import java.util.Date;

/**
 * @author Cédric
 */
public class Enchere {


    // Déclaration des attributs
    private Utilisateur no_utilisateur;
    private ArticleVendu no_article;
    private Date date_enchere;
    private int montant_enchere;

    // Constructeur par défaut
    public Enchere() {

    }

    // Constructeur avec les paramètres
    public Enchere(Utilisateur no_utilisateur, ArticleVendu no_article, Date date_enchere, int montant_enchere) {
        setNo_utilisateur(no_utilisateur);
        setNo_article(no_article);
        setDate_enchere(date_enchere);
        setMontant_enchere(montant_enchere);
    }

    // Déclaration des Getters et des Setters
    public Utilisateur getNo_utilisateur() {
        return no_utilisateur;
    }

    public void setNo_utilisateur(Utilisateur no_utilisateur) {
        this.no_utilisateur = no_utilisateur;
    }

    public ArticleVendu getNo_article() {
        return no_article;
    }

    public void setNo_article(ArticleVendu no_article) {
        this.no_article = no_article;
    }

    public Date getDate_enchere() {
        return date_enchere;
    }

    public void setDate_enchere(Date date_enchere) {
        this.date_enchere = date_enchere;
    }

    public int getMontant_enchere() {
        return montant_enchere;
    }

    public void setMontant_enchere(int montant_enchere) {
        this.montant_enchere = montant_enchere;
    }

    // Surcharge de la méthode toString
    @Override
    public String toString() {
        return "Enchère [numéro utilisateur = " + no_utilisateur + ", numéro article = " + no_article
                + ", date d'enchère = " + date_enchere + ", montant de l'enchère" + montant_enchere + "]";
    }

}
