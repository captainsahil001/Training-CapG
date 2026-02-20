package com;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	
	public static void main(String[] args) {
		
		//Demo demo = new DemoImpl();  here we create objects of impl class 
		                             // and upcast to demo interface coz interf objects cant be created directly
	
		
		
		
		/* If the method is not argument method and void return type method */
		
//		Demo demo = () ->{
//			System.out.println("Implemented by using Lambda Expression");
//		};  // this is how we can declare using lambda expr , here () no argument as functional interface have only 1 method so it points that method only
//		
//		demo.sample();   or below method without parenthesis
		
//		Demo demo = ()-> 
//				System.out.println("Implemented by using Lambda Expression");
//			demo.sample();
		
		
	
		
		/* If the method is single argument method  and void return type method and no mandate parenthesis*/
		
//		Demo demo = num ->{
//			System.out.println("Implemented by using Lambda Expression");
//			System.out.println("Number is " + num);
//		};
//		demo.sample(1000);
		
		
		
		
		/* If the method is more than one argument method and void return type method and parenthesis is mandate*/
		
//		Demo demo = (num1,num2)->{
//			System.out.println("Implemented by using Lambda Expression");
//			System.out.println("Number1 :" + num1);
//			System.out.println("Number2 :" + num2);
//		};
//		demo.sample(1000, 2000);
	
		
		
		
		/* If the method is more than one argument method and is return type */
		
//		1) Demo demo = (num1,num2) ->
//			num1+num2;  or below
//		2) Demo demo = (num1,num2) ->{
//			return num1+num2;
//		};
		
//		System.out.println(demo.sample(1000,2000));
		
		
		/* Types of Functional Interface */
		/* ----------------------------- */
		
		/* Predicate<T> */
		
		Predicate<Integer> isEven = number -> number % 2==0;
		System.out.println(isEven.test(25));
			
		
		/* Function<T, R> */
		
		Function<Integer,Integer> multiply = number -> number*number;
		System.out.println(multiply.apply(2));
		
		/* Supplier<T> */
		
		Supplier<Integer> generateRandom= ()-> new Random().nextInt(1000);
		System.out.println(generateRandom.get());
		
		/* Consumer<T>*/
		
		Consumer<Integer> cons = (result)-> System.out.println(result);
		cons.accept(10);
		
		
	}                                

}
