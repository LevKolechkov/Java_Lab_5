package org.example.lab_5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public void openPerekidivatel() throws IOException {
        openNewForm("perekidivatel.fxml", "Перекидыватель");
    }

    public void openWidgets() throws IOException {
        openNewForm("widgets.fxml", "Виджеты");
    }

    public void openOrder() throws IOException {
        openNewForm("order.fxml", "Заказ");
    }

    public void openCalculator() throws IOException {
        openNewForm("calculator.fxml", "Калькулятор");
    }

    public void openTextFlag() throws IOException {
        openNewForm("text_flag.fxml", "Текстовый флаг");
    }

    private void openNewForm(String fxmlFile, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }
}