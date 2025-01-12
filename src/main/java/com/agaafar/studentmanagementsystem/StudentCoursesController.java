package com.agaafar.studentmanagementsystem;

import com.agaafar.studentmanagementsystem.data.Course;
import com.agaafar.studentmanagementsystem.data.Grade;
import com.agaafar.studentmanagementsystem.data.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

public class StudentCoursesController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    //TODO: Get the column data from control array to be updated


    @FXML
    private TableView<Map<String, String>> enrolledcoursestable;
    @FXML
    private TableColumn<Map<String, String>, String> courseColumn;

    @FXML
    private TableColumn<Map<String, String>, String> gradeColumn;

    ObservableList<Map<String, String>> data = FXCollections.observableArrayList();

    Map<String, String> row1 = Map.of("Math III",  "A+");
    Map<String, String> row2 = Map.of("Applied Programming", "A+");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Add rows to the ObservableList
        data.add(row1);
        data.add(row2);
        // Set up columns
        courseColumn.setCellValueFactory(cellData -> {
            // Assuming the key is the course name
            return new javafx.beans.property.SimpleStringProperty(cellData.getValue().keySet().iterator().next());
        });

        gradeColumn.setCellValueFactory(cellData -> {
            // Assuming the value is the grade
            return new javafx.beans.property.SimpleStringProperty(cellData.getValue().values().iterator().next());
        });
        enrolledcoursestable.setItems(data);

    }


}
