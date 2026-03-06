package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDetailsOfUserByEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String delete="Delete from UserInformation user where user.email=?1";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(delete);
		System.out.println(query);
		System.out.println("Enter user email");
		String email=sc.next();
		query.setParameter(1,email);
		
		int rows=query.executeUpdate();
		if(rows!=0) {
			System.out.println("Data deleted");
		} else {
			System.out.println("No data deleted");
		}
		
		et.commit();
		em.close();
		sc.close();
	}
}