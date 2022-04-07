package com.cg.smms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 

{  
	//user to customer
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private Customer customer;

	private User user;
	
	public User getuser() {
		return user;
	}
	public void setAddress(User user) {
		this.user = user;
	}

	//user to malladmin
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="md_id")
	private MallAdmin malladmin;
	
		public void setmalladmin(User user)
		{
			this.user = user;
		}
		
	//user to shoponwer
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="shopowner_id")
	 private ShopOwner shopowner;
	 
		public void setshopowner(User user) 
		{
			this.user = user;
		}
	
	@Id
	@Column(name="id")
    private long id;
	
	@Column(name="name")
private String name;
	
	@Column(name="type")	
private String type;
	
	@Column(name="password")
private String password;

	public User(Customer customer, User user, MallAdmin malladmin, ShopOwner shopowner, long id, String name,
			String type, String password) {
		super();
		this.customer = customer;
		this.user = user;
		this.malladmin = malladmin;
		this.shopowner = shopowner;
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	public User() {
		super();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public MallAdmin getMalladmin() {
		return malladmin;
	}
	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}
	public ShopOwner getShopowner() {
		return shopowner;
	}
	public void setShopowner(ShopOwner shopowner) {
		this.shopowner = shopowner;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [customer=" + customer + ", user=" + user + ", malladmin=" + malladmin + ", shopowner=" + shopowner
				+ ", id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
}