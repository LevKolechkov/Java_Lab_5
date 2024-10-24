package org.example.lab_5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WidgetsController {
    @FXML
    private TextField textField;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private void toggleTextFieldVisibility() {
        textField.setVisible(!textField.isVisible());
    }

    @FXML
    private void toggleButtonVisibility() {
        button.setVisible(!button.isVisible());
    }

    @FXML
    private void toggleLabelVisibility() {
        label.setVisible(!label.isVisible());
    }
}
