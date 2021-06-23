package fr.eni.encheres.bo;

/*Classe Utilisateur*/

public class Utilisateur {
	private int no_utilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur;

	/*Constructeur vide*/
	public Utilisateur() {
		
	}
	
	/*Constructeur avec tous les paramètres*/
	public Utilisateur(int no_utilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		this.no_utilisateur = no_utilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}
	
	/*Constructeur sans no_utilisateur*/
	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}

	public Utilisateur(String pseudo, String telephone, String rue, String codePostal, String ville) {
		this.pseudo = pseudo;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	public Utilisateur(String pseudo){
		this.pseudo = pseudo;
	}

	/* GETTER */
	public int getno_utilisateur() {
		return no_utilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setno_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public int getCredit() {
		return credit;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public String getVille() {
		return ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public boolean isAdministrateur() {
		return administrateur;
	}

	/* SETTER */
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}

	@Override
	public String toString() {
		return "Utilisateur{" + "no_utilisateur=" + no_utilisateur + ", pseudo='" + pseudo + '\'' + ", nom='" + nom + '\''
				+ ", prenom='" + prenom + '\'' + ", email='" + email + '\'' + ", telephone='" + telephone + '\''
				+ ", rue='" + rue + '\'' + ", codePostal='" + codePostal + '\'' + ", ville='" + ville + '\''
				+ ", motDePasse='" + motDePasse + '\'' + ", credit=" + credit + ", administrateur=" + administrateur
				+ '}';
	}
}
