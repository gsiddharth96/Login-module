package com.login.registration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertCustomer(Customer c) {
		int status=0;
		try{
			con=ConnectionProvider.getCon();
			
			if(con==null)
				System.out.println("connection not created");
			
			ps=con.prepareStatement("insert into customer values(?,?)");
			ps.setString(1,c.getUsername());
			ps.setString(2,c.getPassword());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String userId, String pass) {
		Customer c=new Customer();
		try{
			con=ConnectionProvider.getCon();
			
			if(con==null)
				System.out.println("connection not created");
			
			ps=con.prepareStatement("select * from customer where username=? and password=?");
			ps.setString(1, userId);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return c;
	}
	
	public int insertUrl(InputUrl u)
	{
		int status=0;
		try{
			con=ConnectionProvider.getCon();
			
			if(con==null)
				System.out.println("connection not created");
			
			ps=con.prepareStatement("insert into url values(?)");
			ps.setString(1,u.getUrl());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		//System.out.println("url status"+ status);
		return status;
	}

}
