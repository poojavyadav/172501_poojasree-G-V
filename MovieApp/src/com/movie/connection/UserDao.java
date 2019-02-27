package com.movie.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.movie.pojo.ReviewPojo;
import com.movie.pojo.UserPojo;

public class UserDao {
	public String insert(UserPojo user)
	{
		try {

		String sql =  "insert into userdata values (?,?,?)";
		Connection con=DbConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(sql);
			      
				  pst.setString(1, user.getEmailId());
				  pst.setString(2, user.getPassword());
				  pst.setString(3, user.getConfirmPassword());
				  pst.executeUpdate();
				} 
	    catch (Exception e) {
	              e.printStackTrace();

				}
				return "inserted";
}
	
	public boolean validate(String UserEmail,String UserPassword) {
		
		
		try {
			Connection con=DbConnection.getConnection();
					String query = "select emailid, password from userdata";
			
		     Statement s=con.createStatement();
		      
		     
		      ResultSet results =s.executeQuery(query);
		    
			
			 while (results.next())
			 { 
				 String emailid = results.getString("emailid");
			  String pass = results.getString("password");
			  
			 if ((UserEmail.equals(emailid)) && (UserPassword.equals(pass)))
			 { 
				 
				 return true;
			
			 } }
			
		      
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
		 
		
		
	}
	public int read(ReviewPojo rev) throws Exception
	{
		String query = "insert into review value(?,?)";
		Connection con = DbConnection.getConnection();
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,rev.getRate());
		pstmt.setString(2,rev.getComments());
	int out =pstmt.executeUpdate();
	return out;
	}
	
	
	
	
	public String delete(String emailid,String password,String ConfirmPassword)
	{
		String sql1="delete from userdata where(?)";
		
		return "deleted";
		
	}
}
