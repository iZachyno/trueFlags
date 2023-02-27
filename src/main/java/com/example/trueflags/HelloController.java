package com.example.trueflags;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class HelloController {

    public Button Hungary, Russia, Luxembourg, Gabon, elSalvador;
    public BorderPane primF, secF, thiF;

    String primary, secondary, tertiary, theme;

    void setData()
    {
        Hungary.setStyle("-fx-background-color: " + primary + "35");
        Russia.setStyle("-fx-background-color: " + primary + "35");
        Luxembourg.setStyle("-fx-background-color: " + secondary + "35");
        Gabon.setStyle("-fx-background-color: " + secondary + "35");
        elSalvador.setStyle("-fx-background-color: " + tertiary + "35");
    }

    public void russia()
    {
        primary = "#ffffff";
        secondary = "#1C3578";
        tertiary = "#E4181C";

        primF.setStyle("-fx-background-color: " + primary);
        secF.setStyle("-fx-background-color: " + secondary);
        thiF.setStyle("-fx-background-color: " + tertiary);


         theme = tertiary;

         setData();
    }

    public void gabon()
    {
        primary = "#009E60";
        secondary = "#FCD116";
        tertiary = "#4664B2";

        primF.setStyle("-fx-background-color: " + primary);
        secF.setStyle("-fx-background-color: " + secondary);
        thiF.setStyle("-fx-background-color: " + tertiary);


        theme = tertiary;

        setData();
    }

    public void elsalvador()
    {
        primary = "#0047AB";
        secondary = "#ffffff";
        tertiary = "#0047AB";

        primF.setStyle("-fx-background-color: " + primary);
        secF.setStyle("-fx-background-color: " + secondary);
        thiF.setStyle("-fx-background-color: " + tertiary);


        theme = tertiary;

        setData();
    }

    public void hungary()
    {
        primary = "#CE2939";
        secondary = "#ffffff";
        tertiary = "#436F4D";

        primF.setStyle("-fx-background-color: " + primary);
        secF.setStyle("-fx-background-color: " + secondary);
        thiF.setStyle("-fx-background-color: " + tertiary);


        theme = tertiary;

        setData();
    }

    public void luxembourg()
    {
        primary = "#EA141D";
        secondary = "#ffffff";
        tertiary = "#51ADDA";

        primF.setStyle("-fx-background-color: " + primary);
        secF.setStyle("-fx-background-color: " + secondary);
        thiF.setStyle("-fx-background-color: " + tertiary);

        theme = tertiary;

        setData();
    }

    public void clear(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}