package com.cognizant.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// try with resources
		try( // we are opening resources here
			Scanner sc = new Scanner(System.in);
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","cognizant");
		){
			System.out.println("Employee Id:");
			int empId = sc.nextInt();
			System.out.println("Employee Name:");
			String empName = sc.next();
			System.out.println("Employee Salary:");
			double empSalary = sc.nextDouble();
			System.out.println("Employee Designation:");
			String empD = sc.next();
			
			PreparedStatement statement = connection.prepareStatement("Insert into EMPLOYEES values(?,?,?,?)");
			statement.setInt(1, empId);
			statement.setString(2, empName);
			statement.setDouble(3, empSalary);
			statement.setString(4, empD);
			
			int rows = statement.executeUpdate();
			if(rows>0)
				System.out.println("Record inserted");
			else
				System.out.println("Insert failed");
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
