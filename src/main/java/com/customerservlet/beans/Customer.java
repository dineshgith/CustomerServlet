package com.customerservlet.beans;

public class Customer {

	public Customer() {
		Super();
	}

	private Integer customerId;

	public Integer getCustomerId() {
		return customerId;
	}

	private void Super() {
		// TODO Auto-generated method stub

	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=");
		builder.append(customerId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", suffix=");
		builder.append(suffix);
		builder.append(", email=");
		builder.append(email);
		builder.append(", company=");
		builder.append(company);
		builder.append(", displayName=");
		builder.append(displayName);
		builder.append(", printOnCheckAs=");
		builder.append(printOnCheckAs);
		builder.append(", billingStreet=");
		builder.append(billingStreet);
		builder.append(", billingCity=");
		builder.append(billingCity);
		builder.append(", billingState=");
		builder.append(billingState);
		builder.append(", billingZip=");
		builder.append(billingZip);
		builder.append(", billingCountry=");
		builder.append(billingCountry);
		builder.append(", shippingStreet=");
		builder.append(shippingStreet);
		builder.append(", shippingCity=");
		builder.append(shippingCity);
		builder.append(", shippingState=");
		builder.append(shippingState);
		builder.append(", shippingZip=");
		builder.append(shippingZip);
		builder.append(", shippingCountry=");
		builder.append(shippingCountry);
		builder.append(", otherDetails=");
		builder.append(otherDetails);
		builder.append("]");
		return builder.toString();
	}

	public Customer(Integer customerId, String title, String firstName, String middleName, String lastName,
			String suffix, String email, String company, String displayName, String printOnCheckAs,
			String billingStreet, String billingCity, String billingState, Integer billingZip, String billingCountry,
			String shippingStreet, String shippingCity, String shippingState, Integer shippingZip,
			String shippingCountry, String otherDetails) {
		super();
		this.customerId = customerId;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.email = email;
		this.company = company;
		this.displayName = displayName;
		this.printOnCheckAs = printOnCheckAs;
		this.billingStreet = billingStreet;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.billingZip = billingZip;
		this.billingCountry = billingCountry;
		this.shippingStreet = shippingStreet;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingZip = shippingZip;
		this.shippingCountry = shippingCountry;
		this.otherDetails = otherDetails;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPrintOnCheckAs() {
		return printOnCheckAs;
	}

	public void setPrintOnCheckAs(String printOnCheckAs) {
		this.printOnCheckAs = printOnCheckAs;
	}

	public String getBillingStreet() {
		return billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public Integer getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(Integer billingZip) {
		this.billingZip = billingZip;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getShippingStreet() {
		return shippingStreet;
	}

	public void setShippingStreet(String shippingStreet) {
		this.shippingStreet = shippingStreet;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public Integer getShippingZip() {
		return shippingZip;
	}

	public void setShippingZip(Integer shippingZip) {
		this.shippingZip = shippingZip;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	private String title;

	private String firstName;

	private String middleName;

	private String lastName;

	private String suffix;

	private String email;

	private String company;

	private String displayName;

	private String printOnCheckAs;

	private String billingStreet;

	private String billingCity;

	private String billingState;

	private Integer billingZip;

	private String billingCountry;

	private String shippingStreet;

	private String shippingCity;

	private String shippingState;

	private Integer shippingZip;

	private String shippingCountry;

	private String otherDetails;

}
