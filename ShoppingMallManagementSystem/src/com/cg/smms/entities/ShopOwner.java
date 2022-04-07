package com.cg.smms.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shop_owner")

public class ShopOwner {
	
	//connection of shop to shopowner
	@OneToOne(mappedBy="shopowner")
	private Shop shop;
	
	 //user to shopwoner
	 @OneToOne(mappedBy="shopowner")
		private User user;

	@Id
	@Column(name="shopowner_id")
    private long shopowner_id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="address")
    private String address;
	
	@Column(name="dob")
    private LocalDate dob;
	
	@Column(name="shop_id")
    private Shop shop_id;

	public ShopOwner(Shop shop, User user, long shopowner_id, String name, String address, LocalDate dob,
			Shop shop_id) {
		super();
		this.shop = shop;
		this.user = user;
		this.shopowner_id = shopowner_id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.shop_id = shop_id;
	}

	public ShopOwner() {
		super();
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getShopowner_id() {
		return shopowner_id;
	}

	public void setShopowner_id(long shopowner_id) {
		this.shopowner_id = shopowner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}

	@Override
	public String toString() {
		return "ShopOwner [shop=" + shop + ", user=" + user + ", shopowner_id=" + shopowner_id + ", name=" + name
				+ ", address=" + address + ", dob=" + dob + ", shop_id=" + shop_id + "]";
	}

	
	
	
	
}
