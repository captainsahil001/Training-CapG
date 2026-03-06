package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayUserDetailsByEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String select="select user from UserInformation user where user.email=?1";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query=em.createQuery(select);
		
		System.out.println("Enter user email");
		String email=sc.next();
		query.setParameter(1, email);
		try {
			UserInformation user= (UserInformation) query.getSingleResult();
			System.out.println("User name:"+user.getName());
			System.out.println("User email:"+user.getEmail());
		}
		catch(Exception e) {
			System.out.println("Data not found");
		}
		sc.close();
	}
}