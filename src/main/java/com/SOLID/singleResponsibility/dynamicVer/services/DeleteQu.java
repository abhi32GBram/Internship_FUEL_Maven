package com.SOLID.singleResponsibility.dynamicVer.services;

import com.SOLID.singleResponsibility.dynamicVer.RepoPack.Delete;


import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteQu implements Delete {
    public static String del = "DELETE FROM tblEmployee WHERE id=?;";

    @Override
    public void delete() throws ClassNotFoundException, SQLException, IOException {
        Scanner Sc = new Scanner(System.in);

        PreparedStatement p = Db_Connection.getConnection1().prepareStatement(del);
        System.out.println("ENTER ID TO DELETE: ");
        int id = Sc.nextInt();
        p.setInt(1, id);
        p.executeUpdate();

    }

}
