module org.example.projet_vehicules {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.projet_vehicules to javafx.fxml;
    exports org.example.projet_vehicules;
}