package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateMobileNumberByUsingEmail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String update="Update UserInformation user set user.mobile_number=?1 where user.email=?2";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(update);
		System.out.println(query);
		System.out.println("Enter user mobile number");
		long mb=sc.nextLong();
		query.setParameter(1,mb);
		System.out.println("Enter user email ID");
		String email=sc.next();
		query.setParameter(2, email);
		
		int rows=query.executeUpdate();
		if(rows!=0) {
			System.out.println("Data updated");
		} else {
			System.out.println("No data updated");
		}
		
		et.commit();
		em.close();
		sc.close();
	}
}