/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisequencecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Chizzy Meka | 16036630 | MSc. Computing
 */
public class FibonacciSequenceCalculator extends Application {

    int fib;

    @Override
    public void start(Stage primaryStage) {
        // Create a textfield
        TextField textField = new TextField();

        // Create a button
        Button button = new Button();

        // Create a Label
        Label label = new Label(" Answer");

        // Center text in the label
        label.setAlignment(Pos.CENTER);

        // Set button text
        button.setText("Go");

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    //  Read number from the text field
                    int textFieldNum = Integer.parseInt(textField.getText());
                    
                    int num1 = 0;
                    int num2 = 1;

                    for (int i = 0; i < textFieldNum; i++) {
                        fib = num1 + num2;
                        num1 = num2;
                        num2 = fib;
                    }
                    label.setText("The fibonacci Sequence for the entered number is :" + fib);
                } catch (NumberFormatException nfe) {
                    label.setText("Please make sure you type a valid integer");
                    textField.setText("");
                    textField.requestFocus();
                    nfe.printStackTrace();
                }
            }
        });

        // Create a layout manager
        GridPane root = new GridPane();

        // Put the layout manager in the middle of the scene
        root.setAlignment(Pos.CENTER);

        // Add Textfield, Label and Button
        root.add(textField, 0, 0);
        root.add(button, 0, 1);
        root.add(label, 0, 2);

        // Create the scene
        Scene scene = new Scene(root, 600, 500);

        // Set windows title
        primaryStage.setTitle("Fibonacci Sequence Calculator");

        // Add the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
