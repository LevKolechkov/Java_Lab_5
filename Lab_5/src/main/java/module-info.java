module org.example.lab_5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;
    requires exp4j;


    opens org.example.lab_5 to javafx.fxml;
    exports org.example.lab_5;
}