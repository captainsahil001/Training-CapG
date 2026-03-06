package com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayUserDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String select="Select user from UserInformation user";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_management_system");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(select);
		System.out.println(query);
		
		List<UserInformation> resultSet=query.getResultList();
		if(resultSet.size()!=0) {
			System.out.println("Data available");
			resultSet.stream().forEach(System.out::println);
		} else {
			System.out.println("Data not available");
		}
		et.commit();
		em.close();
		sc.close();
	}
}