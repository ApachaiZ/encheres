package fr.eni.encheres.dal.dao;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.jdbc.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurDAOjdbcImpl implements UtilisateurDAO {

    private static final String INSERT_UTILISATEUR="INSERT INTO UTILISATEURS (pseudo, nom, prenom, email, telephone, rue, code_postal," +
            " ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public Utilisateur inserer(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,
                               String ville, String mot_de_passe, int credit, Boolean administrateur) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Utilisateur utilisateur = new Utilisateur();

        try {
            con = ConnectionProvider.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try{
            con.setAutoCommit(false); // permet de pouvoir effectuer le roolback
            pstmt = con.prepareStatement(INSERT_UTILISATEUR,PreparedStatement.RETURN_GENERATED_KEYS);
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
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()){
                utilisateur.setNo_utilisateur(rs.getInt(1));
            }
            con.commit();
        } catch (Exception e) {
            try{
                con.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }

        return utilisateur;
    }
}
