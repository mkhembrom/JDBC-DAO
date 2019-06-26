package com.hembrom.manjesh;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) //throws Exception,FileNotFoundException,SQLException
	{
		new UserDAO();
	}

}
