package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AllControls extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("allControls.fxml");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(5);
        grid.setHgap(10);

        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("some text...");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        textArea.setWrapText(true);
        textArea.setPrefHeight(150);

        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.setProgress(0.49); 
        progressIndicator.setMinSize(50, 50); 

        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.49); 
        progressBar.setMinWidth(200); 

        Slider slider = new Slider();

      
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);

    
        grid.addRow(0, new Label("Button:"), button);
        grid.addRow(1, new Label("CheckBox:"), checkBox);
        grid.addRow(2, new Label("Hyperlink:"), hyperlink);
        grid.addRow(3, new Label("ToggleButton:"), toggleButton);
        grid.addRow(4, new Label("RadioButton:"), radioButton);
        grid.addRow(5, new Label("Label:"), label);
        grid.addRow(6, new Label("TextField:"), textField);
        grid.addRow(7, new Label("PasswordField:"), passwordField);
        grid.addRow(8, new Label("TextArea:"), textArea);
        GridPane.setColumnSpan(textArea, 2); 

      
        VBox progressIndicatorBox = new VBox(progressIndicator);
        progressIndicatorBox.setAlignment(Pos.CENTER);
        grid.add(new Label("ProgressIndicator:"), 0, 10);
        grid.add(progressIndicatorBox, 1, 10);

        grid.add(new Label("ProgressBar:"), 0, 11);
        grid.add(progressBar, 1, 11);

        grid.add(new Label("Slider:"), 0, 12);
        grid.add(slider, 1, 12);

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}

