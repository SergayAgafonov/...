package com.example.wsautorization;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private TextField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String passwordText = password_field.getText().trim();

            if (!loginText.equals("") && !passwordText.equals(""))
                loginUser(loginText, passwordText);
            else
                System.out.println("Логин или пароль неверный.");
        });


    }
    private void loginUser(String loginText, String passwordText) {
        DataBase dbHandler = new DataBase();

        User user = new User();
        user.setlogin(loginText);
        user.setpassword(passwordText);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        while(true) {
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }

        if (counter >= 1){
            System.out.println("Успешно");
            signUpButton.getScene().getWindow().hide();
            HelloApplication.OpenIcon("hellp-view.fxml");

        }
    }

}
