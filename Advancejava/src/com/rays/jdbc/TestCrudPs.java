package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class TestCrudPs {
	public static void main(String[] args) throws Exception {
		testselect();
		//testgetbyid(4);
		//testadd();
		//testupdate();
		//testdelete();
		int i = nextPK();
		System.out.println(i);
	}


	private static void testgetbyid( int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		
		PreparedStatement ps = conn.prepareStatement("select * from employee where id =?");
		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.println("\t"+rs.getInt(5));	
		}
		ps.close();
		rs.close();
		conn.close();

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


	private static void testdelete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
	    int id = 13;
		
		PreparedStatement ps = conn.prepareStatement("delete from employee where id = ?");
	
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();
		
		System.out.println(i + "deleted");
		ps.close();
		conn.close();		
	}

	private static void testupdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		int id = 13;
		String fname = "sahil";
		String lname = "chouhan";
		int salary = 16000;
		int DEPT_ID = 3;		
		
		PreparedStatement ps = conn.prepareStatement("update employee set fname=?, lname = ?, salary =?,DEPT_ID= ? where id = ?");
	
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setInt(3, salary);
		ps.setInt(4, DEPT_ID);
		ps.setInt(5, id);
		
		int i = ps.executeUpdate();
		
		System.out.println(i + "updated");
		ps.close();
		conn.close();

	}

	private static void testadd() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
	
		String fname = "manish";
		String lname = "kumar";
		int salary = 17000;
		int DEPT_ID = 3;
		
		
		PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1, nextPK());
		ps.setString(2, fname);
		ps.setString(3, lname);
		ps.setInt(4, salary);
		ps.setInt(5, DEPT_ID);
		
		int i = ps.executeUpdate();
		
		System.out.println(i + "added");
		ps.close();
		conn.close();
	}

	private static void testselect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from employee");
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.println("\t"+rs.getInt(5));
		}
		ps.close();
		rs.close();
		conn.close();

	}
}
