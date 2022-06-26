package com.openrdc.openrdc.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

/**
 * @author Davide Bianchi
 * @since 26-06-2022
 * Callback methods of home screen
 * */
public class HomeController {
    /**
     * Callback method for click event on connect button of home scene
     * */
    public void btnConnectCallback(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid IP Address");
        alert.showAndWait();
    }
}
