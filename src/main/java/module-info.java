module com.example.trueflags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trueflags to javafx.fxml;
    exports com.example.trueflags;
}