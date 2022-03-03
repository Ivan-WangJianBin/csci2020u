package com.example.labfive;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudentRecord extends Application {
    Stage Window;
    TableView<DataSource> Lab05;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Window = primaryStage;
        Window.setTitle("Lab05 Solutions");

        TableColumn<DataSource, String> NumColumn = new TableColumn<>("Student Number");
        NumColumn.setMinWidth(100);
        NumColumn.setCellValueFactory(new PropertyValueFactory<>("StudentNum"));

        TableColumn<DataSource, Float> AssignmentColumn = new TableColumn<>("Assignment");
        AssignmentColumn.setMinWidth(100);
        AssignmentColumn.setCellValueFactory(new PropertyValueFactory<>("Assignment"));

        TableColumn<DataSource, Float> MidtermColumn = new TableColumn<>("Midterm");
        MidtermColumn.setMinWidth(100);
        MidtermColumn.setCellValueFactory(new PropertyValueFactory<>("Midterm"));

        TableColumn<DataSource, Float> FinalColumn = new TableColumn<>("Final Exam");
        FinalColumn.setMinWidth(100);
        FinalColumn.setCellValueFactory(new PropertyValueFactory<>("Final"));

        TableColumn<DataSource, Float> MarksColumn = new TableColumn<>("Final Mark");
        MarksColumn.setMinWidth(100);
        MarksColumn.setCellValueFactory(new PropertyValueFactory<>("Marks"));

        TableColumn<DataSource, String> GradeColumn = new TableColumn<>("Grade");
        GradeColumn.setMinWidth(100);
        GradeColumn.setCellValueFactory(new PropertyValueFactory<>("LetterGrade"));

        Lab05 = new TableView<>();
        Lab05.setItems(getAllMarks());
        Lab05.getColumns().addAll(NumColumn,AssignmentColumn,MidtermColumn,FinalColumn, MarksColumn,GradeColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(Lab05);

        Scene scene = new Scene(vBox);
        Window.setScene(scene);
        Window.show();
    }

    public ObservableList<DataSource> getAllMarks(){
        ObservableList<DataSource> marks = FXCollections.observableArrayList();
        marks.add(new DataSource("100100100", 75.0f, 68.0f, 54.25f));
        marks.add(new DataSource("100100101", 70.0f, 69.25f, 51.5f));
        marks.add(new DataSource("100100102", 100.0f, 97.0f, 92.5f));
        marks.add(new DataSource("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new DataSource("100100104", 72.25f, 74.75f, 58.25f));
        marks.add(new DataSource("100100105", 85.0f, 56.0f, 62.5f));
        marks.add(new DataSource("100100106", 70.0f, 66.5f, 61.75f));
        marks.add(new DataSource("100100107", 55.0f, 47.0f, 50.5f));
        marks.add(new DataSource("100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new DataSource("100100109", 82.5f, 77.0f, 74.25f));

        return marks;
    }
}