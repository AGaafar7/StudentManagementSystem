package com.agaafar.studentmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void onStudentButton(ActionEvent event) throws IOException {
        System.out.println("onStudentButtonClick");
        root = FXMLLoader.load(getClass().getResource("studentregister.fxml"));
        stage = (Stage)((Node)event.getSource() ).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onInstructorButton(ActionEvent event) throws IOException {
        System.out.println("onInstructorButtonClick");
        root = FXMLLoader.load(getClass().getResource("instructorregister.fxml"));
        stage = (Stage)((Node)event.getSource() ).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onStudentSubmitButton(ActionEvent event) throws IOException {
        System.out.println("onStudentSubmitButtonClick");

    }
}