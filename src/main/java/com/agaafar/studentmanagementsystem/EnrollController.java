package com.agaafar.studentmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EnrollController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    //TODO: Replace those lists with dyanmic values based on available instructors and courses

    //Available courses dropdown
    @FXML
    private ChoiceBox<String> coursedrop;
    //Instructor dropdown
    @FXML
    private ChoiceBox<String> instructordrop;

    private String[] coursesName = {"Math III", "Electric Circuits II"};
    private String[] instructorsName = {"John", "Doe"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        coursedrop.getItems().addAll(coursesName);
        instructordrop.getItems().addAll(instructorsName);
        coursedrop.setOnAction(this::getCourseDrop);
        instructordrop.setOnAction(this::getInstructorDrop);
    }

    private void getCourseDrop(ActionEvent event) {
        System.out.println("getCourse");
        String course = coursedrop.getValue();
        System.out.println("course: " + course);
    }
    private void getInstructorDrop(ActionEvent event) {
        System.out.println("getInstructor");
        String instructor = instructordrop.getValue();
        System.out.println("instructor: " + instructor);
    }

    @FXML
    protected void onEnrollStudent(ActionEvent event) throws IOException {
        //Add the course and instructor to the student
        System.out.println("onEnrollStudent");
        getCourseDrop(event);
        getInstructorDrop(event);
        System.out.println("onEnrollStudent");
        root = FXMLLoader.load(getClass().getResource("coursesenrolled.fxml"));
        stage = (Stage)((Node)event.getSource() ).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
