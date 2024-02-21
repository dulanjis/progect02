package com.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbconnection.DBconnect;

public class customerDButil {

	

	private static boolean Success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	

	
public static boolean login(String Email, String password) {
	
	try {
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where Email='"+Email+"' and password='"+password+"'";
		rs = stmt.executeQuery(sql);
		
		if (rs.next()) {
			Success = true;
		} else {
			Success = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return Success;
}

public static List<Customer> getCustomer(String Email) {
	
	ArrayList<Customer> customer = new ArrayList<>();
	
	try {
		
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where Email='"+Email+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String fullname = rs.getString(2);
			String email= rs.getString(3);
			String phoneno = rs.getString(4);
			String Brand = rs.getString(5);
			String Model= rs.getString(6);
			String platenumber = rs.getString(7);
		    String password=rs.getString(8);
			
			
			Customer cus=new Customer(id,fullname,email,phoneno,Brand,Model,platenumber,password);
			
			customer.add(cus);
		}
		
	} catch (Exception e) {
		
	}
	//array object
	return customer;	
}


public static boolean insertCustomer(String full_Name,String email,String phone_No,String brand,String model,String plateNumber,String password) {
	
	try {
		
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		String sql="INSERT INTO customer VALUES(0,'"+full_Name+"','"+email+"','"+phone_No+"','"+brand+"','"+model+"','"+plateNumber+"','"+password+"')" ;
		int rs=stmt.executeUpdate(sql);
		
		
		if(rs>0)
		{
			Success=true;
		}
		else
		{
			Success=false;
		}
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	return Success;
}


public static boolean UpdateCustomer(String id,String name,String email,String phone,String brand,String model,String plate) {
	
	try {
		
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		String sql="Update customer set Full_Name='"+name+"' ,Email='"+email+"' ,Phone_No='"+phone+"' ,Brand='"+brand+"' ,Model='"+model+"' ,plateNumber='"+plate+"'"
				+"where idCustomer='"+id+"'" ;
		int rs=stmt.executeUpdate(sql);
		
		
		if(rs>0)
		{
			Success=true;
		}
		else
		{
			Success=false;
		}
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	return Success;
}

public static List<Customer> getUpdateDetails(String Email) {
	
	ArrayList<Customer> customer = new ArrayList<>();
	
	try {
		
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from customer where Email='"+Email+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String fullname = rs.getString(2);
			String email= rs.getString(3);
			String phoneno = rs.getString(4);
			String Brand = rs.getString(5);
			String Model= rs.getString(6);
			String platenumber = rs.getString(7);
		    String password=rs.getString(8);
			
			
			Customer cus=new Customer(id,fullname,email,phoneno,Brand,Model,platenumber,password);
			customer.add(cus);
		}
		
	} catch (Exception e) {
		
	}
	
	return customer;	
}
public static boolean deletecustomer(String id) {
	
	try {
		
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		String sql="delete from customer  where idCustomer='"+id+"'" ;
		int rs=stmt.executeUpdate(sql);
		
		
		if(rs>0)
		{
			Success=true;
		}
		else
		{
			Success=false;
		}
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	return Success;
}
	


}
