package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionUserDetails {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//STEP 1 : LOAD THE PERSISTENCE.XML FILE
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		
		//STEP 2 : ESTABLISH THE CONNECTION AND STEP 3 : CREATE PLATFORM
		EntityManager em= emf.createEntityManager();
		System.out.println("My Persistence.xml file info"+em.getProperties());
		
		//STEP 4 : BEGIN THE TRANSACTION
		EntityTransaction et = em.getTransaction();
		et.begin(); 
		
		//STEP 5 : PERFORM THE OPERATIONS
		/*
		 * Insert
		 * Update
		 * Delete 
		 * select
		 * IF IT IS insert or update or delete operation then 
		 *  STEP 6 : Commit the transaction
		 */
		
		//INSERT
		UserInformation userInformation = new UserInformation();
		System.out.println("Enter user name");
		userInformation.setName(sc.next());
		System.out.println("Enter user email");
		userInformation.setEmail(sc.next());
		System.out.println("Enter user mobile number");
		userInformation.setMobile_number(sc.nextLong());
		System.out.println("Enter user gender");
		userInformation.setGender(sc.next());
		System.out.println(userInformation);
		
		em.persist(userInformation);
		et.commit();
		
		//STEP 7 : CLOSE THE CONNECTION
		em.close();
		sc.close();
	}
}