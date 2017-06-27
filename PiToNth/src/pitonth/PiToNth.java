/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitonth;

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
public class PiToNth extends Application {

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

        // Set event handler
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    //  Read number from the text field
                    int textFieldNum = Integer.parseInt(textField.getText());

                    // Application Logic
                    if (textFieldNum > 0 && textFieldNum < 9) {
                        //Use the input to create an array
                        int[] input = new int[textFieldNum + 1];

                        //Initialise the array
                        for (int i = 0; i < input.length - 1; i++) {
                            input[i] = 0;
                        }
                        input[0] = 1;

                        // Convert the content of the array to a string builder
                        StringBuilder sb = new StringBuilder();
                        for (int i : input) {
                            sb.append(i);
                        }

                        // Convert the content of the array to a string
                        String number = sb.toString();

                        // Convert the string to an int
                        int num = Integer.parseInt(number);

                        //Perform the decimal place operation
                        double finalPiValue = (int) (Math.PI * num) / (double) num;

                        //Output the final value of PI
                        label.setText(" PI rounded to " + textFieldNum + " decimal places is : " + finalPiValue);
                    } else {
                        label.setText("Please ensure that the input number is between '0' and '9'");
                    }

                    textField.setText("");
                    textField.requestFocus();
                    return;
                } catch (NumberFormatException nfe) {
                    label.setText("Please make sure you type a number between '0' and '9'");
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
        primaryStage.setTitle("PI to nth");

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
