package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
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

class SimpleDatabaseMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        try {
            String dbName;
            String s;
            int choice;
            boolean flag = true;
            logger.info("Enter database name : ");
            dbName = sc.nextLine();
            SimpleDatabaseException db = SimpleDatabaseException.getInstance(dbName);
            while (flag) {
                s = "1. Create new connection\n 2. Close connection \n 3. Show current database\n 4. Exit";
                logger.info(s);
                logger.info("Enter your choice : ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        logger.info("Enter new database name : ");
                        sc.nextLine();
                        dbName = sc.nextLine();
                        db.newConnection(dbName);
                        break;
                    case 2:
                        db.closeConnection();
                        break;
                    case 3:
                        s = "You are connected to " + db.getConnection();
                        logger.info(s);
                        break;
                    default:
                        flag = false;
                        break;
                }
            }
        } catch (InputMismatchException e) {
            logger.info("Something went wrong while giving input");
        } catch (Exception e) {
            String s = "Something went wrong " + e;
            logger.info(s);
        }
    }
}