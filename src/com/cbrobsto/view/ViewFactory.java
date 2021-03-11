package com.cbrobsto.view;

import com.cbrobsto.EmailManager;
import com.cbrobsto.controller.BaseController;
import com.cbrobsto.controller.LoginWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {
        System.out.println("show login window called");

        BaseController controller =  new LoginWindowController(emailManager, this, "LoginWindow.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFXMLName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
