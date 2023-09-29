module com.example.morsecode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morsecode to javafx.fxml;
    exports com.example.morsecode;
}