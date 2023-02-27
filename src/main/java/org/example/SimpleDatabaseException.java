package org.example;

import java.util.logging.Logger;


public class SimpleDatabaseException {
    Logger logger = Logger.getLogger("com.api.jar");
    private static SimpleDatabaseException sd;
    private String connection;

    private SimpleDatabaseException(String newConnection) {
        this.connection = newConnection;
    }

    public static SimpleDatabaseException getInstance(String newConnection) {
        if (sd == null) {
            sd = new SimpleDatabaseException(newConnection);
        }
        return sd;
    }

    public void newConnection(String newConnection) {
        this.connection = newConnection;
        String c = "Database connected : " + connection;
        logger.info(c);
    }

    public void closeConnection() {
        connection = "closed";
        logger.info("All connections are closed");
    }

    public String getConnection() {
        return connection;
    }
}

