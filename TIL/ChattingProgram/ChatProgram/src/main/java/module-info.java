module com.example.chatprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatprogram to javafx.fxml;
    exports com.example.chatprogram;
}