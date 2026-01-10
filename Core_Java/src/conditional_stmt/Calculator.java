package conditional_stmt;

public class Calculator {
	public static void main(String[] args) {
        int num1 = 12, num2 = 23;
        String operator = "+";
        int result = 0;
       
        switch (operator) {
            case "+" : result = num1 + num2; break;
            case "-" : result = num1 - num2; break;
            case "*" : result = num1 * num2; break;
            case "/" : result = num1 / num2; break;
            default : System.out.println("Error! please enter a valid input.");
        }
        System.out.println("The result is : " + result);
    }

}
