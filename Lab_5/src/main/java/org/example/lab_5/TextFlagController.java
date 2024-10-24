package org.example.lab_5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TextFlagController {

    @FXML
    private RadioButton stripe1Red;
    @FXML
    private RadioButton stripe1Blue;
    @FXML
    private RadioButton stripe1Green;

    @FXML
    private RadioButton stripe2Yellow;
    @FXML
    private RadioButton stripe2Black;
    @FXML
    private RadioButton stripe2White;

    @FXML
    private RadioButton stripe3Orange;
    @FXML
    private RadioButton stripe3Grey;
    @FXML
    private RadioButton stripe3Purple;

    @FXML
    private Label resultLabel;

    private final ToggleGroup stripe1Group = new ToggleGroup();
    private final ToggleGroup stripe2Group = new ToggleGroup();
    private final ToggleGroup stripe3Group = new ToggleGroup();

    // Инициализация контроллера
    @FXML
    public void initialize() {
        stripe1Red.setToggleGroup(stripe1Group);
        stripe1Blue.setToggleGroup(stripe1Group);
        stripe1Green.setToggleGroup(stripe1Group);

        stripe2Yellow.setToggleGroup(stripe2Group);
        stripe2Black.setToggleGroup(stripe2Group);
        stripe2White.setToggleGroup(stripe2Group);

        stripe3Orange.setToggleGroup(stripe3Group);
        stripe3Grey.setToggleGroup(stripe3Group);
        stripe3Purple.setToggleGroup(stripe3Group);
    }

    @FXML
    private void drawFlag() {
        RadioButton selectedStripe1 = (RadioButton) stripe1Group.getSelectedToggle();
        RadioButton selectedStripe2 = (RadioButton) stripe2Group.getSelectedToggle();
        RadioButton selectedStripe3 = (RadioButton) stripe3Group.getSelectedToggle();

        if (selectedStripe1 != null && selectedStripe2 != null && selectedStripe3 != null) {
            String stripe1Color = selectedStripe1.getText();
            String stripe2Color = selectedStripe2.getText();
            String stripe3Color = selectedStripe3.getText();

            String result = String.format("Вы выбрали: %s, %s, %s", stripe1Color, stripe2Color, stripe3Color);
            resultLabel.setText(result);
        } else {
            resultLabel.setText("Пожалуйста, выберите цвет для каждой полосы.");
        }
    }
}
