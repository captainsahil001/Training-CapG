package maths;

public class DecimalToOctal {
	
	    public static void main(String[] args) {

	        int decimal = 83;  
	        int octal = 0;
	        int place = 1;

	        while (decimal != 0) {
	            int remainder = decimal % 8;
	            octal = octal + remainder * place;
	            place = place * 10;
	            decimal = decimal / 8;
	        }

	        System.out.println("Octal value = " + octal);
	    }
	


}
