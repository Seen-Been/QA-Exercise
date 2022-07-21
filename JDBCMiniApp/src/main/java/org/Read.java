package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read
{
	String url = "jdbc:mysql://localhost:3306/qa-sample";
	String username = "root";
	String password = "root";
	Connection con = null;
	
	public void ReadData()
	{
		try
		{
			con = DriverManager.getConnection(url, username, password); //interfaces define contracts that 
			System.out.println("Connection was successful");
			String query = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) //loop through table rows while data is present
			{
				// Placeholders for table data
				int id = rs.getInt(1); //column indexes start at 1
				String name = rs.getString(2);
				String address = rs.getString(3);
				long phone = rs.getLong(4);//equal to longInt
				System.out.println(id + "--" + name + "--" + address + "--" + phone + "--");
			}
		}
		catch (SQLException e)
		{
			System.out.println("There was an issue with connecting to the database:" + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				System.out.println("Connection closed");
				con.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
