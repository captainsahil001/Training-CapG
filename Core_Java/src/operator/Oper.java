package operator;

public class Oper {
	public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        System.out.println("\nRelational Operators:");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));

 
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5  -> " + c);
        c -= 3;


        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d++ : " + d++);
        System.out.println("++d : " + ++d);



        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n : " + (m & n));
        System.out.println("m | n : " + (m | n));



        System.out.println("\nTernary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);


    }

}
