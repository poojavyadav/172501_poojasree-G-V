package com.movie.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.connection.UserDao;
import com.movie.pojo.UserPojo;


@WebServlet(description = "registration", urlPatterns = { "/SignUp" })
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SignUp() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail=request.getParameter("email");
		String upassword=request.getParameter("psw");
		String rpassword=request.getParameter("psw-repeat");
		UserDao userdao=new UserDao();
		System.out.println(uemail);
		System.out.println(upassword);
		
		if(upassword.equals(rpassword)) {
		UserPojo user=new UserPojo(uemail, upassword, rpassword);
		userdao.insert(user);
		response.sendRedirect("index.html");
		}
		else {
			response.sendRedirect("SignUp.jsp");}
	}

}
