package com.agaafar.studentmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

public class Controller {
    //TODO: create the data from control here to be available throw out the application
    private Stage stage;
    private Scene scene;
    private Parent root;
    //Student Name Field
    @FXML
    private TextField studentName;
    //Birthday Date Field
    @FXML
    private DatePicker doB;

    private String studentNameLocal;
    private LocalDate doBLocal;


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
        //TODO: add student data to list and the uid is the registration number
        int UID;
        System.out.println("onStudentSubmitButton");
        studentNameLocal = studentName.getText();
        System.out.println("studentNameLocal: " + studentNameLocal);
        getDate(event);
        //Navigate to select course
        FXMLLoader loader = new FXMLLoader(getClass().getResource("coursestudentselection.fxml"));
        root = loader.load();
        EnrollController enrollController = loader.getController();

        stage = (Stage)((Node)event.getSource() ).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void getDate(ActionEvent event) throws IOException {
        System.out.println("getDate");
        doBLocal = doB.getValue();
        System.out.println("doBLocal: " + doBLocal);
    }

}