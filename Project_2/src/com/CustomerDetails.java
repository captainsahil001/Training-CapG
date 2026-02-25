package com;
import org.MyApis;

public class CustomerDetails {
	
	private int id;
	private String name;
	private long mobilenumber;
	private String emailid;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public void validateMobileNumber(long mobilenumber) {
		
		MyApis myApis = new MyApis();
		int length = myApis.findTheLengthOfTheNumber(mobilenumber);
		if(length == 10) {
			System.out.println("Valid Mobile Number : "+ mobilenumber);
			this.mobilenumber = mobilenumber;
		}else {
			System.out.println("Invalid Mobile Number : " + mobilenumber);
		}
	}
	
	
	public void validateMail(String mails){
		MyApis myApis1 = new MyApis();
		if(myApis1.validMail(mails)) {
			System.out.println("Valid Mail : "+ mails);
			this.emailid = mails;
			
		}else {
			System.out.println("Invalid Mail : "+ mails);
		}

	}
	public static void main(String[] args) {
		CustomerDetails customerDetails = new CustomerDetails();
		
		customerDetails.validateMobileNumber(9876394581l);
		
		customerDetails.validateMail("sahilghosh0512@gmail.com");
		
	}

}
