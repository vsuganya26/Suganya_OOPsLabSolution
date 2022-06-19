package com.lab1.service;

import com.lab1.model.Employees;

public class EmployeeCredentialService {

	String companyName = "gl";

	Employees isa = new Employees();
	PasswordGenerator pg = new PasswordGenerator();

	/** This method generates the username based on the below parameters and the password is gnerated
	 * @param firstName
	 * @param lastName
	 * @param department
	 */
	public void generateCredentials(String firstName, String lastName, String department) {

		String userName = firstName + lastName + "@" + department + "." + companyName + ".com";
		String passWord = pg.generatePassword();

		isa.setUserName(userName);
		isa.setPassWord(passWord);
		isa.setFirstName(firstName);
		isa.setLastName(lastName);
	}

	/**
	 * This method displays the user credentials
	 */
	public void displayCredentials() {
		System.out.println("Dear" + " " + isa.getFirstName() + " " + "your generated credentials are as follows");
		System.out.println("Email --->" + " " + isa.getUserName());
		System.out.println("Password --->" + " " + isa.getPassWord());
	}

}
