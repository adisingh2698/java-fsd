package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datatransfer.user;

/**
 * Servlet implementation class servletthird
 */
public class servletthird extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletthird() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession(false);
		
		if (session!=null ) {
			user u=(user) session.getAttribute("user");
			
		
		
		u.setCity(request.getParameter("city"));
		u.setContact(Long.parseLong(request.getParameter("contact")));
		session.setAttribute("user", u);
		PrintWriter out= response.getWriter();
		out.println( "<h2> hello"+u.getMailid() + "<h2>");
		out.println( "<h3> details"+u + "<h3>");
		out.println( "<h4> session id is"+session.getId() + "<h4>");
		session.invalidate();
		}
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
