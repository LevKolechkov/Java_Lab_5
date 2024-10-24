package org.example.lab_5;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.tokenizer.UnknownFunctionOrVariableException;

public class CalculatorController {

    @FXML
    private TextField expressionField;

    @FXML
    private Label resultLabel;

    @FXML
    private void appendNumber(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String number = clickedButton.getText();
        expressionField.appendText(number);
    }

    @FXML
    private void appendOperation(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String operation = clickedButton.getText();
        expressionField.appendText(operation);
    }

    @FXML
    private void calculate() {
        String expressionText = expressionField.getText();
        if (expressionText.isEmpty()) {
            showError("Введите выражение для вычисления");
            return;
        }

        try {
            Expression expression = new ExpressionBuilder(expressionText).build();
            double result = expression.evaluate();

            resultLabel.setText("Результат: " + result);
        } catch (UnknownFunctionOrVariableException e) {
            showError("Ошибка: Некорректное выражение");
        } catch (ArithmeticException e) {
            showError("Ошибка: деление на ноль невозможно");
        } catch (Exception e) {
            showError("Ошибка при вычислении выражения");
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Ошибка");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
