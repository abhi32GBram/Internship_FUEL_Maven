package com.jdbc.rightWay;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {

    public static void main(String[] args)  throws IOException, ClassNotFoundException, SQLException {

        String DRIVER_STRING;
        String DB_URL;
        String DB_USERNAME;
        String Db_PASSWORD;

        File file1 = new File("C:\\Users\\VC\\IdeaProjects\\FUEL\\src\\main\\java\\com\\jdbc\\rightWay\\db.properties");
        FileInputStream ff = new FileInputStream(file1);


        Properties p1 = new Properties();

        p1.load(ff);

        DRIVER_STRING = p1.getProperty("driver");
        DB_URL = p1.getProperty("db_url");
        DB_USERNAME = p1.getProperty("db_username");
        Db_PASSWORD = p1.getProperty("db_password");

        Class.forName(DRIVER_STRING);
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, Db_PASSWORD);
        System.out.println("CONNECTION TO DB ESTABLISHED SUCCESSFULLY");

    }

}
