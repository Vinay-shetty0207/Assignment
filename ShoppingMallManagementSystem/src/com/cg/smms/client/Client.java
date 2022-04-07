package com.cg.smms.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;
import com.cg.smms.service.ICustomerService;
import com.cg.smms.service.ICustomerServiceImpl;

public class Client {

	public static void main(String[] args)
	
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Item item=new Item();
		item.setId(1);
		item.setItemName("Mobile");
		item.setManufacturingDate("2021");
		item.setPrice(2000);
		item.setExpiry("2050");
		
		Employee empl=new Employee();
		empl.setId(200);
		empl.setName("Saqlain"); 
		//empl.setDob(09-10-1997);
		empl.setSalary(100000);
		empl.setAddress("Newyork");
		empl.setDesignation("Developer");
		
		Shop shop=new Shop();
		shop.setShop_Id(101);
		//shop.setShopEmployees_Id(null);
		shop.setShopName("Apple");
		//shop.setShopowner(shop"abc");
		
		//Shop shop= new Shop();   //this is for employee table
		//shop
		
		
		  Shop shop1 = new Shop(); // shop1.getitemid(); //this is for for item table
		  // shop1.getname("abc");
		  
		  Employee emp=new Employee(); emp.getId(); emp.getName(); emp.getDob();
		  emp.getSalary(); emp.getAddress(); emp.getDesignation();
		  //emp.shopEmployees();
		  
		  Item Item = new Item(); item.getId(); item.getItemName();
		  item.getManufacturingDate(); item.getExpiry(); item.getPrice();
		  //item.category(); missing
		  
		//  Shop.addEmployee("emp"); shop.addItem("item");
		 
		//em.persist(shopEmployees);
		//emp.persist(item);
		
		System.out.println("Added shop along with two employees to database.");
		
		em.getTransaction().commit();
	
		
		
		  ICustomerService customerservice=new ICustomerServiceImpl();
		  customerservice.cancelOrder(2);
		 
		

	}

}

