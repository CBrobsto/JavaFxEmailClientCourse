module JavaFxEmailClientCourse {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.cbrobsto;
    opens com.cbrobsto.view;
    opens com.cbrobsto.controller;
}