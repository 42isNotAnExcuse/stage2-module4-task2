package com.mjc.stage2.impl;


import com.mjc.stage2.Connection;

public class ProxyConnection implements Connection {
    private RealConnection realConnection;

    public ProxyConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    public Connection reallyClose() {
        // Write your code here!
        realConnection.close();
        return realConnection;
    }

    // Implement methods here!

    @Override
    public void close() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }
}
