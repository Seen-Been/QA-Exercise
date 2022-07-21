package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String username = "root";
		String password = "root";
		
		try (Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				) //try with resource
		{
			
			System.out.println("Connection was successful");
			String query = "select * from student";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) //loop through table rows while date is present
			{
				// place holders for table data
				int id = rs.getInt(1); //column indexes start at 1
				String name = rs.getString(2);
				String address = rs.getString(3);
				long phone = rs.getLong(4);//equal to longInt
				System.out.println(id + "--" + name + "--" + address + "--" + phone + "--");
			}
			rs.close(); //make sure to close resources not needed anymore
			stmt.close();
		}
		catch (SQLException e)
		{
			System.out.println("There was an issue with connecting to the database:" + e.getMessage());
			e.printStackTrace();
		}
	}
}

