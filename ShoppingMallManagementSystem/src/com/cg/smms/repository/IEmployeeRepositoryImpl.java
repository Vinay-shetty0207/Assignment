package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Employee;

public class IEmployeeRepositoryImpl implements IEmployeeRepository{
	
	private EntityManager entityManager;
	public IEmployeeRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return null;
	}

	@Override
	public Employee searchEmployee(long id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(long id) {
		entityManager.remove(id);
		return true;
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
