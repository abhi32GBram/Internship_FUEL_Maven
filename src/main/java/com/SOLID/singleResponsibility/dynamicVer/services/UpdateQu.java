package com.SOLID.singleResponsibility.dynamicVer.services;

import com.SOLID.singleResponsibility.dynamicVer.RepoPack.Update;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQu implements Update {
    public static String upd = "UPDATE internship SET name=?, duration=? WHERE id=?;";

    @Override
    public void update() throws ClassNotFoundException, SQLException, IOException {

        PreparedStatement p = Db_Connection.getConnection1().prepareStatement(upd);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ID TO UPDATE: ");
        int id = sc.nextInt();

        System.out.println("ENTER NEW NAME: ");
        String name = sc.next();

        System.out.println("ENTER NEW DURATION");
        int duration = sc.nextInt();

        p.setString(1, name);
        p.setInt(2, duration);
        p.setInt(3, id);

        p.executeUpdate();
        System.out.println("DATA UPDATED SUCCESSFULLY !");


    }

}

