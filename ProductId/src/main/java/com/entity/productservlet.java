package com.entity;

import java.io.PrintWriter;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productservlet
 */
  @WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		{
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();

		        // Retrieve product ID from the form
		        String productIdStr = request.getParameter("productId");

		        if (productIdStr != null && !productIdStr.isEmpty()) {
		            try {
		                int productId = Integer.parseInt(productIdStr);

		                // Fetch product details from the database
		                Product product = DBConn.getProductDetails(productId);

		                if (product != null) {
		                    // Display product details
		                    out.println("<html><body>");
		                    out.println("<h2>Product Details</h2>");
		                    out.println("<p>ID: " + product.getId() + "</p>");
		                    out.println("<p>Name: " + product.getName() + "</p>");
		                    out.println("<p>Description: " + product.getDescription() + "</p>");
		                    out.println("<p>Price: $" + product.getPrice() + "</p>");
		                    out.println("</body></html>");
		                } else {
		                    out.println("<html><body>");
		                    out.println("<h2>Product not found</h2>");
		                    out.println("</body></html>");
		                }

		            } catch (NumberFormatException e) {
		                out.println("<html><body>");
		                out.println("<h2>Invalid Product ID</h2>");
		                out.println("</body></html>");
		            }
		        } else {
		            out.println("<html><body>");
		            out.println("<h2>Please enter a Product ID</h2>");
		            out.println("</body></html>");
		        }
		    }
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
