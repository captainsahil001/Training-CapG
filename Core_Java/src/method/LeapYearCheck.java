package method;

public class LeapYearCheck {
	

	   public static void checkLeapYear(int year) {

	        if (year % 400 == 0) {
	            System.out.println(year + " is a Leap Year");

	        } else if (year % 100 == 0) {
	            System.out.println(year + " is NOT a Leap Year");

	        } else if (year % 4 == 0) {
	            System.out.println(year + " is a Leap Year");

	        } else {
	            System.out.println(year + " is NOT a Leap Year");
	        }
	    }

	    public static void main(String[] args) {
	        checkLeapYear(2024);   
	    }
	

}
