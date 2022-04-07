package com.cg.smms.repository;

import com.cg.smms.entities.Customer;

public interface ICustomerRepository {
public Customer addCustomer(Customer customer);
public Customer updateCustomer(Customer customer);
//public Customer searchCustomer(long id);
//public Customer deleteCustomer(long id);
public Customer searchCustomer(int id);
public Customer deleteCustomer(int id);
public abstract void commitTransaction();
public abstract void beginTransaction();
}
