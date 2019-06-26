package com.hembrom.manjesh;

import java.sql.*;

public class UserDAO {
	
	private int userid;
	private String username;
	private String userbranch;
	
	String sql = "insert into student values(?,?,?)";
	
	UserDAO()
	{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mydb","root","13miku11");
			PreparedStatement ps = con.prepareStatement(sql);
			
			InsertStudent();
			
			ps.setInt(1, userid);
			ps.setString(2, username);
			ps.setString(3, userbranch);
			
			int c = ps.executeUpdate();
			System.out.println("Row affected : "+c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ChecK Connection MariaDB..!");
		}

		
	}
	
	public void InsertStudent()
	{
		userInput();
		
		UserDeatils user = new UserDeatils();
		user.setId(userid);
		user.setName(username);
		user.setBranch(userbranch);
	}
	
	public void userInput()
	{
		System.out.println("Enter Student id : ");
		userid = new java.util.Scanner(System.in).nextInt();
		System.out.println("Enter Student name : ");
		username = new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter Student branch : ");
		userbranch = new java.util.Scanner(System.in).nextLine();
	}
	
}
