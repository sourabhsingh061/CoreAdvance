package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactAndExcephandling {
	public static void main(String[] args) throws Exception {
	//	testinsert();
		testadd();
	}
private static void testadd() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
	conn.setAutoCommit(false);
	Statement stmt = conn.createStatement();
	 stmt.executeUpdate("insert into employee values(15,'ritik','patel', 13000,4)");
	 stmt.executeUpdate("insert into employee values(16,'ritik','patel', 13000,4)");
	 stmt.executeUpdate("insert into employee values(12,'ritik','patel', 13000,4)");
	conn.commit();
	System.out.println("inserted");
	stmt.close();
	conn.close();		
	}
public static void testinsert() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	 	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		 stmt.executeUpdate("insert into employee values(15,'ritik','patel', 13000,4)");
		 stmt.executeUpdate("insert into employee values(16,'ritik','patel', 13000,4)");
		 stmt.executeUpdate("insert into employee values(12,'ritik','patel', 13000,4)");
		conn.rollback();
		System.out.println("inserted");
		stmt.close();
		conn.close();
	}

}
