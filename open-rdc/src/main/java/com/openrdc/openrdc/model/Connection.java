package com.openrdc.openrdc.model;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Class that contains all information about the current connection
 * This class is a singleton
 * */
public class Connection {

    private InetAddress remoteIp;
    private int remotePort;
    private static Connection instance = null;
    private Socket socket;

    /**
     * Constructor, it is private because this class is a singleton
     * @param remoteIp ip address of the remote device
     * @param remotePort port number of the remote device
     * */
    private Connection(InetAddress remoteIp, int remotePort){
        this.remoteIp = remoteIp;
        this.remotePort = remotePort;
    }

    /**
     * This method is used for sending a connection request if there aren't connections open
     * @param remoteIp ip address of the remote device
     * @param remotePort port number of the remote device
     * @return instance if a connection doesn't exists or null if a connection just exists or there is an error while open connection
     * */
    public static synchronized Connection openConnection(InetAddress remoteIp, int remotePort){
        if(instance == null){
            // create an instance of the object
            instance = new Connection(remoteIp, remotePort);

            // try to open connection
            try {
                Socket socket = new Socket(remoteIp, remotePort);
                instance.setSocket(socket);
            } catch (IOException e) {
                instance = null;
                return null;
            }
            return instance;
        }
        return null;
    }

    /**
     * Method used for get the instance of the class
     * @return Connection instance
     * */
    public static Connection getInstance(){
        return instance;
    }

    /**
     * Method used for creating a connection instance when a request of connection is recived, if there aren't connections open
     * @return A new instance of connection class or null if a connection is open
     * */
    public static synchronized Connection acceptConnection(Socket socket){
        if(instance == null){
            instance = new Connection(socket.getInetAddress(), socket.getPort());
            instance.setSocket(socket);
            return instance;
        }
        return null;
    }

    /**
     * Method used for closing connection
     * @return true if connection has been closed, false if there is an error
     * */
    public boolean closeConnection(){
        try {
            socket.close();
            instance = null;
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Method used to set socket attribute only by openConnection method
     * @param socket Socket object instance
     * */
    private void setSocket(Socket socket){
        this.socket = socket;
    }

    /**
     * Method used to get socket attribute instance
     * @return Socket
     * */
    public Socket getSocket(){
        return socket;
    }



}
