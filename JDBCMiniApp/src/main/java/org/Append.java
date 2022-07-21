package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Append
{
	String url = "jdbc:mysql://localhost:3306/qa-sample";
	String username = "root";
	String password = "root";
	//Connection con = null;
	
	public void AppendData()
	{
		//example of having this in try block (you can also add prepared statements here)
		try(Connection con = DriverManager.getConnection(url, username, password); Statement stmt = con.createStatement();)
		{
			//con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection was successful");
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter an ID:");
			int id = scn.nextInt();
			System.out.println("Enter a name:");
			String name = scn.next();
			System.out.println("Enter a country:");
			String address = scn.next();
			System.out.println("Enter a phone number:");
			long phone = scn.nextLong();
			
			String query = "insert into student values(" + id + ", '"+name+"', '"+ address +"', " + phone + ")"; //Java statement
			//Statement stmt = con.createStatement(); //SQL Statement
			stmt.executeUpdate(query);
			System.out.println("One record inserted");
			scn.close();
		}
		catch (SQLException e)
		{
			System.out.println("There was an issue with connecting to the database:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
