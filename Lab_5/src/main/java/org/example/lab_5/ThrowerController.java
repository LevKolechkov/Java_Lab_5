package org.example.lab_5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ThrowerController {

    @FXML
    private TextField firstTextField;

    @FXML
    private TextField secondTextField;

    @FXML
    private Button swapButton;

    private boolean isLeft = true;

    @FXML
    private void swapText() {
        if (isLeft) {
            secondTextField.setText(firstTextField.getText());
            firstTextField.clear();
            swapButton.setText("⟵");
        } else {
            firstTextField.setText(secondTextField.getText());
            secondTextField.clear();
            swapButton.setText("⟶");
        }
        isLeft = !isLeft;
    }
}
