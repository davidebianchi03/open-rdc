package com.openrdc.openrdc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * @author Davide Bianchi
 * @since 26-06-2022
 * Callback methods of home screen
 * */
public class HomeController {

    /**
     * Text Field where user input the remote computer ip address to connect
     * */
    @FXML private TextField txtIpAddress;

    /**
     * Callback method for click event on connect button of home scene
     * */
    public void btnConnectCallback(ActionEvent actionEvent) {
        String ipAddress = txtIpAddress.getText();

        // ip address validation with regex
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        if(ipAddress.matches(PATTERN)){
            // valid ip address
            /**
             * TODO
             * Connection to remote host
             * */

        }
        else{
            // not valid ip address
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid IP Address");
            alert.showAndWait();
        }
    }
}
