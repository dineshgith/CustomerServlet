package com.customerservlet.util;

import javax.servlet.http.HttpServletRequest;

import com.hibernate.entity.Customers;

public class CustomerUtil {
	public static Customers customerInfo(HttpServletRequest request) {
		Customers customer = new Customers();
		String customerId = request.getParameter("customerId");
		String title = request.getParameter("title");
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("lastName");
		String suffix = request.getParameter("suffix");
		String email = request.getParameter("email");
		String company = request.getParameter("company");
		String displayName = request.getParameter("displayName");
		String printOnCheckAs = request.getParameter("printOnCheckAs");
		String billingStreet = request.getParameter("billingStreet");
		String billingCity = request.getParameter("billingCity");
		String billingState = request.getParameter("billingState");
		String billingZip = request.getParameter("billingZip");
		String billingCountry = request.getParameter("billingCountry");
		String shippingStreet = request.getParameter("shippingStreet");
		String shippingCity = request.getParameter("shippingCity");
		String shippingState = request.getParameter("shippingState");
		String shippingZip = request.getParameter("shippingZip");
		String shippingCountry = request.getParameter("shippingCountry");
		String otherDetails = request.getParameter("otherDetails");

		customer.setCustomerId(Integer.parseInt(customerId));

		customer.setTitle(title);
		customer.setFirstName(firstName);
		customer.setMiddleName(middleName);
		customer.setLastName(lastName);
		customer.setSuffix(suffix);
		customer.setEmail(email);
		customer.setCompany(company);
		customer.setDisplayName(displayName);
		customer.setPrintOnCheckAs(printOnCheckAs);

		customer.setBillingStreet(billingStreet);
		customer.setBillingCity(billingCity);
		customer.setBillingState(billingState);
		customer.setShippingZip(billingZip);
		customer.setBillingCountry(billingCountry);

		customer.setShippingStreet(shippingStreet);
		customer.setShippingCity(shippingCity);
		customer.setShippingState(shippingState);
		customer.setShippingZip(shippingZip);
		customer.setShippingState(shippingCountry);

		customer.setOtherDetails(otherDetails);
		return customer;

	}

	public static Integer customerInfoById(HttpServletRequest request) {
		Integer customerId = Integer.parseInt(request.getParameter("customerId"));
		return customerId;

	}
}
