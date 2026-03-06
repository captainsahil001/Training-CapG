package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmailIdByUsingUserId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		System.out.println("Enter User Id");
		UserInformation information=em.find(UserInformation.class,sc.nextInt());
		if(information!=null) {
			System.out.println("Enter User email");
			information.setEmail(sc.next());
			
			em.merge(information);
			System.out.println("Email updated successfully...");
		} else {
			System.out.println("No data found...");
		}
		et.commit();
		em.close();
		sc.close();
	}
}