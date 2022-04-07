package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name="shopitem_id")
	private Shop sitem_id;


	@Column(name = "id")
	private int id;

	@Column(name = "itemName")
	private String itemName;

	@Column(name = "price")
	private double price;

	@Column(name = "manufacturingDate")
	private String manufacturingDate; // LocalDate manufacturingDate;

	@Column(name = "expiry")
	private String expiry; // LocalDate expiry
	
	private enum category {
		CLOTHING, MOBILES, ACCESSIORIES
	}

	
	public Item(Shop sitem_id, int id, String itemName, double price, String manufacturingDate, String expiry) {
		super();
		this.sitem_id = sitem_id;
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expiry = expiry;
	}


	public Item() {
		super();
	}


	public Shop getSitem_id() {
		return sitem_id;
	}


	public void setSitem_id(Shop sitem_id) {
		this.sitem_id = sitem_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getManufacturingDate() {
		return manufacturingDate;
	}


	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}


	public String getExpiry() {
		return expiry;
	}


	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Item [sitem_id=" + sitem_id + ", id=" + id + ", itemName=" + itemName + ", price=" + price
				+ ", manufacturingDate=" + manufacturingDate + ", expiry=" + expiry + "]";
	}

	
}
