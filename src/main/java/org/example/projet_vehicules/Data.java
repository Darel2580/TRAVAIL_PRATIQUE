package org.example.projet_vehicules;

import javafx.event.ActionEvent;

import java.sql.*;

public class Data {

    public void inserer(String id,String typev,String marque_vehicule,String Modele_véhicule,String annee){
        String sql="INSERT INTO parking(plaque_immatriculation,marque,Modele,Typee, annee) VALUES(?,?,?,?,?)";
        String url = "jdbc:mysql://localhost:3306/parcvehicule?";

        try {
            Connection conn = DriverManager.getConnection(url,"root","");
            PreparedStatement st= conn.prepareStatement(sql);
            st.setString(1,id);
            st.setString(2,marque_vehicule);
            st.setString(3,Modele_véhicule);
            st.setString(4,typev);
            st.setString(5,annee);
            st.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }



    public void supprimerCompte(String id) throws SQLException {
        String query = "DELETE FROM parking WHERE plaque_immatriculation = ?";
        DatabaseConnection con=new DatabaseConnection();
        Connection conn= con.connect();
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
        }
    }
    public void modifier(String  newMarque,String newMedel,String newType,String id) throws SQLException {
        DatabaseConnection con=new DatabaseConnection();
        Connection conn= con.connect();
        String query = "UPDATE vehic SET marque_vehicule=?,Modele_véhicule= ?,typev = ? WHERE id = ?";
        try (
              PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newMarque);
            stmt.setString(2, newMedel);
            stmt.setString(3, newType);
            stmt.setString(4, id);
            stmt.executeUpdate();
        }
    }

    public void affciher(){
        DatabaseConnection con=new DatabaseConnection();
        Connection conn= con.connect();
        String sql="SELECT * FROM parking";
        try {
            Statement st= conn.createStatement();
            ResultSet result=st.executeQuery(sql);


                    } catch (Exception e) {
            throw new RuntimeException(e);
        }
//    }
////    public void rechercherVehicule(String id) throws SQLException {
////        String query = "SELECT *FROM parking WHERE plaque_immatriculation = ?";
////        DatabaseConnection con=new DatabaseConnection();
}
}
