package com.movie.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.connection.UserDao;


@WebServlet(description = "login description", urlPatterns = { "/Login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String useremail=request.getParameter("emailid");
		String userpassword=request.getParameter("psw");
		UserDao userdao=new UserDao(); 
	       boolean status=true;
	     status= userdao.validate(useremail,userpassword);
		
		 PrintWriter out=response.getWriter();
		if(status==true)
		{
			response.sendRedirect("index.html");
			
		}
		else
		{
			response.sendRedirect("login.jsp");
			
		}
		
	}

}
