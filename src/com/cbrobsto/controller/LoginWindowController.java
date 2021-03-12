package com.cbrobsto.controller;

import com.cbrobsto.EmailManager;
import com.cbrobsto.controller.services.LoginService;
import com.cbrobsto.model.EmailAccount;
import com.cbrobsto.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController {

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private Label errorLabel;

    @FXML
    private TextField emailAddressField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void loginButtonAction() {
        System.out.println("loginButtonAction!!");
        if(fieldsAreValid()){
            EmailAccount emailAccount = new EmailAccount(emailAddressField.getText(), passwordField.getText());
            LoginService loginService = new LoginService(emailAccount, emailManager);
            EmailLoginResult emailLoginResult= loginService.login();

            switch (emailLoginResult) {
                case SUCCESS:
                    System.out.println("login succesfull!!!" + emailAccount);
                    return;
            }
        }

//        viewFactory.showMainWindow();
//        Stage stage = (Stage) errorLabel.getScene().getWindow();
//        viewFactory.closeStage(stage);
    }

    private boolean fieldsAreValid() {
        if (emailAddressField.getText().isEmpty()) {
            errorLabel.setText("Please fill email");
            return false;
        }
        if (passwordField.getText().isEmpty()) {
            errorLabel.setText("Please fill password");
            return false;
        }

        return true;
    }
}