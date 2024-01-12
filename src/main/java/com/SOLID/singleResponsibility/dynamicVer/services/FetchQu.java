package com.SOLID.singleResponsibility.dynamicVer.services;

import com.SOLID.singleResponsibility.dynamicVer.RepoPack.Fetch;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchQu implements Fetch {
    public static String fetch = "select id, name, duration from internship;";

    @Override
    public void fetch() throws ClassNotFoundException, SQLException, IOException {

        Statement st = Db_Connection.getConnection1().createStatement();
        ResultSet rs = st.executeQuery(fetch);
        System.out.println("ID" + "\t" + "NAME" + "\t" + "DURATION");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
        }
        st.close();


    }


}
