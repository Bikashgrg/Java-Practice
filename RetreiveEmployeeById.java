package com.cognizant.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetreiveEmployeeById {

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
			PreparedStatement statement = connection.prepareStatement("select * from EMPLOYEES where EMP_ID=?");
			statement.setInt(1, empId);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("EMP_ID \t"+"EMP NAME \t"+"EMP SALARY \t"+"EMP DESIGNATION");
			while(resultSet.next()){
				System.out.println(resultSet.getInt("EMP_ID")+"\t"+resultSet.getString("EMP_NAME")+"\t"+resultSet.getDouble("EMP_SALARY")+"\t"+resultSet.getString("EMP_DESIGNATION"));
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
