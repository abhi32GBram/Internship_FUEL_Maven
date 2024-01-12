package com.SOLID.singleResponsibility;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class Create implements Insert{
	static String insertString="INSERT INTO internship (id, name, duration) VALUES (1005,'rightWays', 1294);";

	@Override
	public void add() throws ClassNotFoundException, SQLException, IOException {
		Statement statement =  DbConnection.getConnection1().createStatement();
		statement.executeUpdate(insertString);
		System.out.println("data inserted successfully");
	}
	
}
