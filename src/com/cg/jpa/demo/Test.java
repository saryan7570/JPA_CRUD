package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String args[]) {
		
		Employee employee;
		Employee employee2;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("a");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		Create
//		employee = new Employee(101, "Nitin");
//		em.persist(employee);
//		em.getTransaction().commit();
//		System.out.println("Inserted Sucessfully");
//		
//		Read
//		employee = em.find(Employee.class, 101);
//		System.out.println(employee.getName());
//		
//		Update
//		em.getTransaction().begin();
//		employee = em.find(Employee.class, 101);
//		employee.setName("Nikish");
//		em.merge(employee);
//		em.getTransaction().commit();
//		
//		Delete
//		em.getTransaction().begin();
//		employee = em.find(Employee.class, 101);
//		em.remove(employee);
//		em.getTransaction().commit();
		
		employee = new Employee();
		employee.setName("Ankit");
		em.persist(employee);
		em.getTransaction().commit();
		employee2 = new Employee();
		em.getTransaction().begin();
		employee2.setName("Nitin");
		em.persist(employee2);
		em.getTransaction().commit();
		System.out.println("Inserted Sucessfully");
		
	}
}