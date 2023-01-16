package com.rays.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class TestCrud {
	public static void main(String[] args) throws Exception {
	     // testselect();
		testinsert();
		//testupdate();
		//testdelete();
		//testgetById();
		
	      nextPK();
	}
	private static int nextPK() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		int pk =0;
		PreparedStatement ps = conn.prepareStatement("select max(id) from employee");
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
        	pk =rs.getInt(1);
        }
        ps.close();
        rs.close();
        conn.close();
		return pk+1;
		
	

	}


	

	private static void testselect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		conn.setAutoCommit(false);
		Statement stmt =conn.createStatement();
		conn.commit();
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()){
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.println("\t"+rs.getInt(5));
			

		}
		
	rs.close();
	stmt.close();
	conn.close();
	}
	public static void testinsert() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		int id = nextPK();
		 stmt.executeUpdate("insert into employee values(nextPK(),'ritik','patel', 13000,4)");
		 
		 
		// stmt.executeUpdate("insert into employee values(16,'ritik','patel', 13000,4)");
		 //stmt.executeUpdate("insert into employee values(12,'ritik','patel', 13000,4)");
		conn.commit();
		System.out.println("inserted");
		stmt.close();
		conn.close();
	}
	public static void testupdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("update employee set fname='Rajesh' where id = 1");
		System.out.println("updated");
		stmt.close();
		conn.close();
		
	}
 public static void testdelete() throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
	 Statement stmt = conn.createStatement();
	 int i = stmt.executeUpdate("delete from employee where id =  12");
	 System.out.println("deleted");
	 stmt.close();
	 conn.close();
 }
 public static void testgetById() throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
	 Statement stmt = conn.createStatement();
	 ResultSet rs = stmt.executeQuery("select *  from employee where id =3");
	  while(rs.next()) {
		  System.out.println("\t"+ rs.getInt(1));
		  System.out.println("\t"+ rs.getString(2));
		  System.out.println("\t"+ rs.getString(3));
		  System.out.println("\t"+ rs.getInt(4));
		  System.out.println("\t"+ rs.getInt(5));

	  }
	  rs.close();
	  stmt.close();
	  conn.close();
	  
 }
	

}
