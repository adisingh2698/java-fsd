package com.product;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class ProductServlet
 */

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Retrieve form data
        String productName = request.getParameter("productName");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Display the entered data directly in the servlet response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Product Details</title></head><body>");
        out.println("<h2>Entered Product Details</h2>");
        out.println("<p><strong>Product Name:</strong> " + productName + "</p>");
        out.println("<p><strong>Price:</strong> $" + price + "</p>");
        out.println("<p><strong>Quantity:</strong> " + quantity + "</p>");
        out.println("</body></html>");
    }

	}


