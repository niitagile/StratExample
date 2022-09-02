package com.crud.service;

import java.sql.Connection;
import java.sql.DriverManager;
/*
 * mysql> desc studentdetails;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| rollno   | int         | NO   | PRI | NULL    |       |
| studname | varchar(20) | YES  |     | NULL    |       |
| dob      | date        | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
3 rows in set (0.12 sec)
 */
public class StudentConnection {
	
	/*public static Connection getConnection(){
		Connection con=null;
		//Step 1 : load Driver in memory
				try {
					//to call Class loader to load class in memory at dymanic time
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					
				
				
					//Step 2: Database information 
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cred", "root","Comnet@123");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return con;
	}*/
	public static Connection getConnection(){
		Connection con=null;
		//Step 1 : load Driver in memory
				try {
					//to call Class loader to load class in memory at dymanic time
					Class.forName("oracle.jdbc.OracleDriver");
					
					
				
				
					//Step 2: Database information 
				con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:orcl", "hr","hr1");
				//for remote oracle
				//con=DriverManager.getConnection("jdbc:oracle:thin@//192.32.78.90:1521:orcl", "hr","hr1");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return con;
	}
}
