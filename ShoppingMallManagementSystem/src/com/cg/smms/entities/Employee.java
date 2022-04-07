package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 @Entity
 @Table(name="employee")
 
public class Employee implements Serializable{
	 
	  //connection of shop to employee
	   @ManyToOne
		@JoinColumn(name="shopitem_id")
		private Shop sitem_id;
	 
	 private static final long serialVersionUID = 1L;
	 @Id
	 
	 @Column(name="id")
private long id;
	 
	 @Column(name="name")
private String name;
	 
	 @Column(name="dob")
private LocalDate dob;
	 
	 @Column(name="salary")
private float salary;
	 
	 @Column(name="address")
private String address;
	 
	 @Column(name="designation")
private String designation;

	public Employee(Shop sitem_id, long id, String name, LocalDate dob, float salary, String address,
			String designation) {
		super();
		this.sitem_id = sitem_id;
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
	}

	public Employee() {
		super();
	}

	public Shop getSitem_id() {
		return sitem_id;
	}

	public void setSitem_id(Shop sitem_id) {
		this.sitem_id = sitem_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [sitem_id=" + sitem_id + ", id=" + id + ", name=" + name + ", dob=" + dob + ", salary="
				+ salary + ", address=" + address + ", designation=" + designation + "]";
	}
	  
}
