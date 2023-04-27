module com.example.thesisall {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires java.net.http;


    opens com.example.thesisall to javafx.fxml;
    exports com.example.thesisall;
}