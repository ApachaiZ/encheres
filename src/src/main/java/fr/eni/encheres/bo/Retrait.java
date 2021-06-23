package fr.eni.encheres.bo;

/**
 * 
 * @author Cédric
 *
 */

public class Retrait {



	// Déclaration des attributs
	private ArticleVendu no_article;
	private String rue;
	private String code_postal;
	private String ville;

	// Constructeur par défaut
	public Retrait() {

	}

	// Constructeur avec tous les paramètres
	public Retrait(ArticleVendu no_article, String rue, String code_postal, String ville) {
		setNo_article(no_article);
		setRue(rue);
		setCode_postal(code_postal);
		setVille(ville);
	}

	// Déclaration des Getters et des Setters
	public ArticleVendu getNo_article() {
		return no_article;
	}

	public void setNo_article(ArticleVendu no_article) {
		this.no_article = no_article;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	// Surcharge de la méthode toString
	@Override
	public String toString() {
		return "Retrait [numéro article = " + no_article+ ", rue = " + rue + ", code postal = " + code_postal 
				+", ville = "+ ville +"]";
}
}
