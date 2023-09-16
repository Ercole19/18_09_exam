module com.example.exam1809 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exam1809 to javafx.fxml;
    exports com.example.exam1809;
}