package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.Customer;
import com.cg.smms.repository.JPAUtil;


public class ICustomerRepositoryImpl implements ICustomerRepository
{
	private EntityManager entityManager;
	public ICustomerRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
		}
	@Override
	public Customer addCustomer(Customer customer) 
	{
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) 
	{
		Customer customers = entityManager.merge(customer);
		return customers;
	}

	@Override
	public Customer searchCustomer(int id) 
	{
		Customer customers = entityManager.find(Customer.class, id);
		return customers;
	}

	@Override
	public Customer deleteCustomer(int id) 
	{
		entityManager.remove(id);
		return null;
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}
