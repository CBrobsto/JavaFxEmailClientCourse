package com.cbrobsto.view;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController {

    @FXML
    private TreeView<?> emailsTreeView;

    @FXML
    private TableView<?> emailsTableView;

    @FXML
    private WebView emailWebView;

    @FXML
    void optionsAction() {
        // Singleton.getInstance().getThisObject().getSomething().doSomething();
        // One approach to inter-class communication.
        // However, as you can see above, this does not lead to very clean code.
        // As time goes on, the Singleton grows larger and larger.
    }

}

