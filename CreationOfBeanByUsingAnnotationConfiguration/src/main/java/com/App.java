package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeDetails.class); // here mention that class whose bean is to be created / or else use component scan to take other class beans too
//    	String[] beanDefinitionNames = context.getBeanDefinitionNames();
//    	
//    	for(String string: beanDefinitionNames) {
//    		System.out.println(string);
//    	}
		
		
		/* to get the method of a particular class we use get bean */
		EmployeeDetails employeeDetails = context.getBean(EmployeeDetails.class);
		
		employeeDetails.displayEmployeeDetails();
    }
}
