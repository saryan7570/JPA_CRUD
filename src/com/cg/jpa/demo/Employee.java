package com.cg.jpa.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JPAEmp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="a")
	@SequenceGenerator(name="a", sequenceName="Emp")
	private int id;
	@Column(name="ename", length=20)
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		super();
	}
}