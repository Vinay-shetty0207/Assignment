package com.cg.smms.entities;

import java.io.Serializable;
import java.rmi.dgc.Lease;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="shop")
@Inheritance(strategy=InheritanceType.JOINED)

public class Shop implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	//connection of employee Pojo class
	@OneToMany( mappedBy ="Eshop_id",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();
	
	//connection of item pojo class
	@OneToMany( mappedBy ="sitem_id",cascade=CascadeType.ALL)
	private	Set<Item> items= new HashSet<>();
	
	//connection of customers pojo class
    @OneToMany( mappedBy ="scust_id",cascade=CascadeType.ALL)
    private	Set<Customer> customer= new HashSet<>();
     
     //connection of shopOwner pojo class
    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shopowner_id")
	private ShopOwner shopowner;
	private Shop shop;
    
	public Shop getshop() {
		return shop;
	}
	public void setshopowner(Shop shop) {
		this.shop = shop;
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shop_Id")
    private int shop_Id;
	
 	
    private enum shopCategory{ WHOLESALE , RETAIL };

    @Column(name="Eshop_id")
    private Employee Eshop_id;
    
    @Column(name="sitem_id")
    private Item sitem_id;
    
    @Column(name="scust_id")
    private	Customer scust_id;

    @Column(name="shopName")
    private String shopName;

   private enum shopStatus{ OPEN , CLOSED};

   @Column(name="leaseStatus")
   private Lease leaseStatus;




public Shop(Set<Employee> employees, Set<Item> items, Set<Customer> customer, ShopOwner shopowner, Shop shop,
		int shop_Id, Employee eshop_id, Item sitem_id, Customer scust_id, String shopName, Lease leaseStatus) {
	super();
	this.employees = employees;
	this.items = items;
	this.customer = customer;
	this.shopowner = shopowner;
	this.shop = shop;
	this.shop_Id = shop_Id;
	Eshop_id = eshop_id;
	this.sitem_id = sitem_id;
	this.scust_id = scust_id;
	this.shopName = shopName;
	this.leaseStatus = leaseStatus;
}
public Shop() {
	super();
}
public Set<Employee> getEmployees() {
	return employees;
}
public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}
public Set<Item> getItems() {
	return items;
}
public void setItems(Set<Item> items) {
	this.items = items;
}
public Set<Customer> getCustomer() {
	return customer;
}
public void setCustomer(Set<Customer> customer) {
	this.customer = customer;
}
public ShopOwner getShopowner() {
	return shopowner;
}
public void setShopowner(ShopOwner shopowner) {
	this.shopowner = shopowner;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}
public int getShop_Id() {
	return shop_Id;
}
public void setShop_Id(int shop_Id) {
	this.shop_Id = shop_Id;
}
public Employee getEshop_id() {
	return Eshop_id;
}
public void setEshop_id(Employee eshop_id) {
	Eshop_id = eshop_id;
}
public Item getSitem_id() {
	return sitem_id;
}
public void setSitem_id(Item sitem_id) {
	this.sitem_id = sitem_id;
}
public Customer getScust_id() {
	return scust_id;
}
public void setScust_id(Customer scust_id) {
	this.scust_id = scust_id;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public Lease getLeaseStatus() {
	return leaseStatus;
}
public void setLeaseStatus(Lease leaseStatus) {
	this.leaseStatus = leaseStatus;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Shop [employees=" + employees + ", items=" + items + ", customer=" + customer + ", shopowner=" + shopowner
			+ ", shop=" + shop + ", shop_Id=" + shop_Id + ", Eshop_id=" + Eshop_id + ", sitem_id=" + sitem_id
			+ ", scust_id=" + scust_id + ", shopName=" + shopName + ", leaseStatus=" + leaseStatus + "]";
}





}

