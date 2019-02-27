package com.movie.review;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.connection.UserDao;
import com.movie.pojo.ReviewPojo;

/**
 * Servlet implementation class Review
 */
@WebServlet(description = "contains rating and comments", urlPatterns = { "/Review" })
public class Review extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Review() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comment=request.getParameter("comment");
		String rate = request.getParameter("rating");
		UserDao userdb = new UserDao();
		try {
			userdb.read(new ReviewPojo(rate,comment));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
