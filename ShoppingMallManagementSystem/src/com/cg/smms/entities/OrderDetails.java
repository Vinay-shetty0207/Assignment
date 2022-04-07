package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable
{
	private static final long serialVersionUID = 1L;

	//association
	@ManyToOne
	@JoinColumn(name="codetails_id")
	private Customer corderdetails_id;
	
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="dateOfPurchase")
    private LocalDateTime dateOfPurchase;
	
	@Column(name="total")
    private float total;
	
	@Column(name="customers")
	private List<Customer>customers;
	
	
	private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING}


	public OrderDetails(Customer corderdetails_id, int id, LocalDateTime dateOfPurchase, float total,
			List<Customer> customers) {
		super();
		this.corderdetails_id = corderdetails_id;
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.customers = customers;
	}

	public OrderDetails() {
		super();
	}

	public Customer getCorderdetails_id() {
		return corderdetails_id;
	}

	public void setCorderdetails_id(Customer corderdetails_id) {
		this.corderdetails_id = corderdetails_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrderDetails [corderdetails_id=" + corderdetails_id + ", id=" + id + ", dateOfPurchase="
				+ dateOfPurchase + ", total=" + total + ", customers=" + customers + "]";
	};
     
}
