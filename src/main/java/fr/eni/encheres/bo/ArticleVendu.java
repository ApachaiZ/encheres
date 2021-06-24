package fr.eni.encheres.bo;

import java.sql.Date;

public class ArticleVendu {

    private int no_article;
    private String nom_article;
    private String description;
    private Date date_debut_encheres, date_fin_encheres;
    private int prix_initial, prix_vente;
    private Utilisateur no_utilisateur;
    private Categorie no_categorie;


    public ArticleVendu(int no_article, String nom_article, String description, Date date_debut_encheres,
                        Date date_fin_encheres, int prix_initial, int prix_vente, Utilisateur no_utilisateur,
                        Categorie no_categorie) {
        super();
        this.no_article = no_article;
        this.nom_article = nom_article;
        this.description = description;
        this.date_debut_encheres = date_debut_encheres;
        this.date_fin_encheres = date_fin_encheres;
        this.prix_initial = prix_initial;
        this.prix_vente = prix_vente;
        this.no_utilisateur = no_utilisateur;
        this.no_categorie = no_categorie;
    }

    /**
     * @return the no_article
     */
    public int getNo_article() {
        return no_article;
    }

    /**
     * @param no_article the no_article to set
     */
    public void setNo_article(int no_article) {
        this.no_article = no_article;
    }

    /**
     * @return the nom_article
     */
    public String getNom_article() {
        return nom_article;
    }

    /**
     * @param nom_article the nom_article to set
     */
    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date_debut_encheres
     */
    public Date getDate_debut_encheres() {
        return date_debut_encheres;
    }

    /**
     * @param date_debut_encheres the date_debut_encheres to set
     */
    public void setDate_debut_encheres(Date date_debut_encheres) {
        this.date_debut_encheres = date_debut_encheres;
    }

    /**
     * @return the date_fin_encheres
     */
    public Date getDate_fin_encheres() {
        return date_fin_encheres;
    }

    /**
     * @param date_fin_encheres the date_fin_encheres to set
     */
    public void setDate_fin_encheres(Date date_fin_encheres) {
        this.date_fin_encheres = date_fin_encheres;
    }

    /**
     * @return the prix_initial
     */
    public int getPrix_initial() {
        return prix_initial;
    }

    /**
     * @param prix_initial the prix_initial to set
     */
    public void setPrix_initial(int prix_initial) {
        this.prix_initial = prix_initial;
    }

    /**
     * @return the prix_vente
     */
    public int getPrix_vente() {
        return prix_vente;
    }

    /**
     * @param prix_vente the prix_vente to set
     */
    public void setPrix_vente(int prix_vente) {
        this.prix_vente = prix_vente;
    }

    /**
     * @return the no_utilisateur
     */
    public Utilisateur getNo_utilisateur() {
        return no_utilisateur;
    }

    /**
     * @param no_utilisateur the no_utilisateur to set
     */
    public void setNo_utilisateur(Utilisateur no_utilisateur) {
        this.no_utilisateur = no_utilisateur;
    }

    /**
     * @return the no_categorie
     */
    public Categorie getNo_categorie() {
        return no_categorie;
    }

    /**
     * @param no_categorie the no_categorie to set
     */
    public void setNo_categorie(Categorie no_categorie) {
        this.no_categorie = no_categorie;
    }

    @Override
    public String toString() {
        return "ArticleVendu [no_article=" + no_article + ", nom_article=" + nom_article + ", description="
                + description + ", date_debut_encheres=" + date_debut_encheres + ", date_fin_encheres="
                + date_fin_encheres + ", prix_initial=" + prix_initial + ", prix_vente=" + prix_vente
                + ", no_utilisateur=" + no_utilisateur + ", no_categorie=" + no_categorie + "]";
    }


}