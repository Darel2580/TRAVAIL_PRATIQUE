package org.example.projet_vehicules;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Rechercher {
    public void lister_vehicule(ActionEvent actionEvent) throws IOException {

        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lister.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("LISTE DE VEHICULES");
        stage.setScene(scene);
        stage.show();
    }

    public void aceuil(ActionEvent actionEvent) {

    }
}
