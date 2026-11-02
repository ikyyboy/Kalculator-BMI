package com.mycompany.kalkulatorbmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        URL lokasi = App.class.getResource(
        "/com/mycompany/kalkulatorbmi/tampilan.fxml"
);

System.out.println("Lokasi FXML: " + lokasi);

FXMLLoader fxmlLoader = new FXMLLoader(
    App.class.getResource("/fxml/Calculator.fxml")
);

Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 400, 500);

        stage.setTitle("Kalkulator BMI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}