package com;

public class Main {
	
	
	public static void main(String[] args) {
		
		//Demo demo = new DemoImpl();  here we create objects of impl class 
		                             // and upcast to demo interface coz interf objects cant be created directly
	
		Demo demo = () ->{
			System.out.println("Implemented by using Lambda Expression");
		};  // this is how we can declare using lambda expr , here () no argument as functional interface have only 1 method so it points that method only
		
		demo.sample();
	}                                

}
