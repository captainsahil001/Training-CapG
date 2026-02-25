package org;

public class MyApis {
	
	public int findTheLengthOfTheNumber(long number) {
       
		/* Generic method*/
		int length = 0;
		while(number != 0) {
			length++;
			number /= 10;
		}
		
		return length;
		
		
		/* Using inbuilt method*/
//		return String.valueOf(number).length();
		
		
	}
	
	public boolean validMail(String mail) {
		if(mail.contains("@gmail.com")) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyApis myApis = new MyApis();
		System.out.println(myApis.findTheLengthOfTheNumber(123456789));
	}

}
