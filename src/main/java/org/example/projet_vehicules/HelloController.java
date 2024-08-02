package org.example.projet_vehicules;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML
    private Button delete,ajouter_vehicule,lister,quiter_appk,recherche,modification,nombre,valider_ajout;



    @FXML
    public void ajout_new_car(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ajouter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void suprimer_vehicule (ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("suppression.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Suppression du vehicule");
        stage.setScene(scene);
        stage.show();
    }


    public void modifier_vehicule(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("modification.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MODIFIER");
        stage.setScene(scene);
        stage.show();
    }

    public void rechercher_vehiucule(ActionEvent actionEvent) throws IOException {Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("recherche.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("RECHERCHER PAR  IMMATRICULATION!");
        stage.setScene(scene);
        stage.show();

    }

    public void nombre_vehicule(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nombre.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MODIFICATION");
        stage.setScene(scene);
        stage.show();

    }


    public void exit(ActionEvent actionEvent) {
        System.exit(0);

    }

    public void lister_vehicule(ActionEvent actionEvent) throws IOException {

        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lister.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("LISTE DE VEHICULES ENREGISTRER");
        stage.setScene(scene);
        stage.show();
    }

}



