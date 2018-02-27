package com.customerservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.entity.Customers;
import com.hibernate.exception.CustomException;
import com.hibernate.interf.CustomerService;
import com.hibernate.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerInfoServlet
 */
public class CustomerInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Integer customerId = com.customerservlet.util.CustomerUtil.customerInfoById(request);
		try {
			CustomerService csi = new CustomerServiceImpl();
			Customers customer = csi.loadCustomer(customerId);
			System.out.println(customer);
			request.setAttribute("customer", customer);
			request.getRequestDispatcher("search.jsp").forward(request, response);

		} catch (CustomException e) {
			response.getWriter().println("Customer information is not displayed");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customers customer = com.customerservlet.util.CustomerUtil.customerInfo(request);
		try {
			CustomerService csi = new CustomerServiceImpl();
			csi.addCustomer(customer);
			response.getWriter().println("Customer is added");
		} catch (CustomException e) {
			response.getWriter().println("Customer is not added");
		}

	}

}
