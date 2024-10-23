package org.example.lab_5;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class OrderController {

    @FXML
    private CheckBox dish1CheckBox;

    @FXML
    private Spinner<Integer> dish1Spinner;

    @FXML
    private CheckBox dish2CheckBox;

    @FXML
    private Spinner<Integer> dish2Spinner;

    @FXML
    private CheckBox dish3CheckBox;

    @FXML
    private Spinner<Integer> dish3Spinner;

    private final int priceDish1 = 500;
    private final int priceDish2 = 300;
    private final int priceDish3 = 200;

    @FXML
    public void initialize() {
        dish1Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1));
        dish2Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1));
        dish3Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1));
    }

    @FXML
    private void placeOrder() {
        StringBuilder receipt = new StringBuilder();
        int totalPrice = 0;

        if (dish1CheckBox.isSelected()) {
            int quantity = dish1Spinner.getValue();
            int cost = priceDish1 * quantity;
            receipt.append(String.format("Борщ: %d порций, %d ₽\n", quantity, cost));
            totalPrice += cost;
        }

        if (dish2CheckBox.isSelected()) {
            int quantity = dish2Spinner.getValue();
            int cost = priceDish2 * quantity;
            receipt.append(String.format("Пельмеши: %d порций, %d ₽\n", quantity, cost));
            totalPrice += cost;
        }

        if (dish3CheckBox.isSelected()) {
            int quantity = dish3Spinner.getValue();
            int cost = priceDish3 * quantity;
            receipt.append(String.format("Салат: %d порций, %d ₽\n", quantity, cost));
            totalPrice += cost;
        }

        receipt.append(String.format("\nИтоговая стоимость: %d ₽", totalPrice));

        showReceipt(receipt.toString());
    }
    private void showReceipt(String receiptText) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Чек");
        alert.setHeaderText("Ваш заказ");
        alert.setContentText(receiptText);
        alert.showAndWait();
    }
}