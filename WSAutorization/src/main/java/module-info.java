module com.example.wsautorization {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.wsautorization to javafx.fxml;
    exports com.example.wsautorization;
}