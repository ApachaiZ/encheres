package fr.eni.encheres.bo;

/**
 * 
 * @author Cédric
 *
 */

public class Categorie {

	// Déclaration des attributs
	private int no_categorie;
	private String libelle;

	// Constructeur par défaut
	public Categorie() {

	}

	// Constructeur avec tous les paramètres
	public Categorie(int no_categorie, String libelle) {
		setNo_categorie(no_categorie);
		setLibelle(libelle);
	}

	// Déclaration des Getters et des Setters
	public int getNo_categorie() {
		return no_categorie;
	}

	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	// Surcharge de la méthode toString
	@Override
	public String toString() {
		return "Categorie [no_categorie = " + no_categorie + ", libelle = " + libelle + "]";
	}

}
