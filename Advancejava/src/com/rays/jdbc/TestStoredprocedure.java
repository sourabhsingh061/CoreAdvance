package com.rays.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestStoredprocedure {
	public static void main(String[] args) throws Exception {
		 testcbstmt();
	}
	private static void testcbstmt() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technology","root","root");	
		CallableStatement cal =conn.prepareCall("{call empcounts(?)}");
		cal.registerOutParameter(1, Types.INTEGER);
		cal.execute();
		System.out.println(cal.getInt(1));
		cal.close();
		conn.close();
		
	}
}
