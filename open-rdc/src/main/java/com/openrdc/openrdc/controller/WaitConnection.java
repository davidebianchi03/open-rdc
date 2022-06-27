package com.openrdc.openrdc.controller;

import com.openrdc.openrdc.model.Settings;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Class that listen on a separate thread for incoming connection requests
 * */
public class WaitConnection extends Thread{

    public WaitConnection(){

    }

    @Override
    public void run() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(Settings.port);
            Socket socket = serverSocket.accept();

            //ask user permission for connection
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    Alert userConfirmAlert = new Alert(Alert.AlertType.CONFIRMATION, "You have recived a connection request from " +
                            socket.getInetAddress().toString() + ".\nDo you want to accept it?");

                    userConfirmAlert.showAndWait();
                    if (userConfirmAlert.getResult() == ButtonType.OK) {
                        //connection opened response
                    }
                    else{
                        //refused connection response
                    }
                }
            });


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
