package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datatransfer .*;
/**
 * Servlet implementation class servletfirst
 */
public class servletfirst extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servletfirst() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		user u=new user();
		HttpSession session=request.getSession();
		
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		session.setAttribute("user", u);
		response.sendRedirect("two.html");
	}

}
