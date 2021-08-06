package com.example.mvc.singleton;


public class Bclass {
    private SocketClient socketClient;

    public Bclass() {
        this.socketClient = SocketClient.getInstance();

    }
    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
