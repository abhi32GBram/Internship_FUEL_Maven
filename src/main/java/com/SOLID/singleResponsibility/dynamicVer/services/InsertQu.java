package com.SOLID.singleResponsibility.dynamicVer.services;

import com.SOLID.singleResponsibility.dynamicVer.RepoPack.Create;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertQu implements Create {
    static String insert = "INSERT INTO internship (id, name, duration) VALUES (?,?,?);";

    @Override
    public void add() throws ClassNotFoundException, SQLException, IOException {

        PreparedStatement pStatement = Db_Connection.getConnection1().prepareStatement(insert);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ID: ");
        int id = sc.nextInt();
        System.out.println("ENTER NAME");
        String name = sc.next();
        System.out.println("ENTER INTERNSHIP DURATION");
        int duration = sc.nextInt();


        pStatement.setInt(1, id);
        pStatement.setString(2, name);
        pStatement.setInt(3, duration);

        pStatement.executeUpdate();
        System.out.println("DATA INSERTED SUCCESSFULLY !");
    }
}
