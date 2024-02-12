package com.entity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/addProduct")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		// ProductServlet.java
		
		
		   
		        String name = request.getParameter("name");
		        double price = Double.parseDouble(request.getParameter("price"));

		        product product = new product();
		        product.setName(name);
		        product.setPrice(price);

		        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
		            Transaction transaction = session.beginTransaction();
		            session.save(product);
		            transaction.commit();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        response.sendRedirect("index.jsp"); // Redirect to a success page
		    }
		

	}


