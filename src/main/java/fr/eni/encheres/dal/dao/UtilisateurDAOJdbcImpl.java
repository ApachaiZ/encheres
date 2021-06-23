package fr.eni.encheres.dal.dao;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.jdbc.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

    private static final String SELECT_UTILISATEUR = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, " +
            "ville, mot_de_passe, credit, administrateur FROM UTILISATEURS WHERE pseudo = ? AND mot_de_passe = ?";


    public Utilisateur select(String pseudo, String mot_de_passe) {
        Connection con = null;
        PreparedStatement prepareStatement;
        Utilisateur utilisateur = new Utilisateur();
        try {
            con = ConnectionProvider.getConnection();
            prepareStatement = con.prepareStatement(SELECT_UTILISATEUR);
            prepareStatement.setString(1, pseudo);
            prepareStatement.setString(2, mot_de_passe);
            ResultSet resultSet = prepareStatement.executeQuery();
            if(resultSet.next()){
                utilisateur = new Utilisateur();
                utilisateur.setNo_utilisateur(resultSet.getInt("no_utilisateur"));
                utilisateur.setPseudo(resultSet.getString("pseudo"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateur.setTelephone(resultSet.getString("telephone"));
                utilisateur.setRue(resultSet.getString("rue"));
                utilisateur.setCodePostal(resultSet.getString("code_postal"));
                utilisateur.setVille(resultSet.getString("ville"));
                utilisateur.setMotDePasse(resultSet.getString("mot_de_passe"));
                utilisateur.setCredit(resultSet.getInt("credit"));
                utilisateur.setAdministrateur(resultSet.getBoolean("administrateur"));
            }
        } catch (Exception e) {
            try{
                assert con != null;
                con.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return utilisateur;
    }

    private static final String INSERT_UTILISATEUR = "INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal," +
            " ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    public Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,
                               String ville, String mot_de_passe, int credit, Boolean administrateur) {
        Connection con = null;
        PreparedStatement pstmt;
        Utilisateur utilisateur = new Utilisateur();

        try{
            con = ConnectionProvider.getConnection();
            assert con != null;
            con.setAutoCommit(false); // permet de pouvoir effectuer le roolback
            pstmt = con.prepareStatement(INSERT_UTILISATEUR, RETURN_GENERATED_KEYS);
            pstmt.setString(1,pseudo);
            pstmt.setString(2,nom);
            pstmt.setString(3,prenom);
            pstmt.setString(4,email);
            pstmt.setString(5,telephone);
            pstmt.setString(6, rue);
            pstmt.setString(7,code_postal);
            pstmt.setString(8,ville);
            pstmt.setString(9,mot_de_passe);
            pstmt.setInt(10,credit);
            pstmt.setInt(11,0);
            pstmt.setInt(11,0);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()){
                utilisateur.setNo_utilisateur(rs.getInt(1));
            }
            con.commit();
        } catch (Exception e) {
            try{
                assert con != null;
                con.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return utilisateur;
    }

    private static final String AUTRE_PROFIL = "SELECT  pseudo, nom, prenom, email, telephone, rue, code_postal, ville, telephone " +
            "from UTILISATEURS where pseudo = ?";

    public Utilisateur afficher(String pseudo) {

        Connection con = null;
        PreparedStatement prepareStatement;
        Utilisateur utilisateur = new Utilisateur();
        try {
            con = ConnectionProvider.getConnection();
            prepareStatement = con.prepareStatement(AUTRE_PROFIL);
            prepareStatement.setString(1, pseudo);
            ResultSet resultSet = prepareStatement.executeQuery();

            if(resultSet.next()){
                utilisateur = new Utilisateur();
                utilisateur.setPseudo(resultSet.getString("pseudo"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateur.setTelephone(resultSet.getString("telephone"));
                utilisateur.setRue(resultSet.getString("rue"));
                utilisateur.setCodePostal(resultSet.getString("code_postal"));
                utilisateur.setVille(resultSet.getString("ville"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return utilisateur;
    }
}
