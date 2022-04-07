package com.cg.smms.entities;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import java.util.List;
@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

	 @ManyToOne
	 @JoinColumn(name="shopcustomer_id")
	 private Shop scust_id;

	 @OneToMany( mappedBy ="corderdetails_id",cascade=CascadeType.ALL)
	 private List<OrderDetails> orderdetails= new LinkedList<>();

	 @OneToOne(mappedBy="customer")
	 private User user;

	private static final long serialVersionUID = 1L;
	@Id
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private int phone; // long phone;

	@Column(name = "email")
	private String email;

	@Column(name="codetails_id")
    private	Customer codetails_id;

	public Customer(Shop scust_id, List<OrderDetails> orderdetails, User user, int id, String name, int phone,
			String email, Customer codetails_id) {
		super();
		this.scust_id = scust_id;
		this.orderdetails = orderdetails;
		this.user = user;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.codetails_id = codetails_id;
	}

	public Customer() {
		super();
	}

	public Shop getScust_id() {
		return scust_id;
	}

	public void setScust_id(Shop scust_id) {
		this.scust_id = scust_id;
	}

	public List<OrderDetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetails> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getCodetails_id() {
		return codetails_id;
	}

	public void setCodetails_id(Customer codetails_id) {
		this.codetails_id = codetails_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [scust_id=" + scust_id + ", orderdetails=" + orderdetails + ", user=" + user + ", id=" + id
				+ ", name=" + name + ", phone=" + phone + ", email=" + email + ", codetails_id=" + codetails_id + "]";
	}
}
