package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeRepository repository;
	public IEmployeeServiceImpl()
	{
		repository=new IEmployeeRepositoryImpl();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public Employee searchEmployee(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean deleteEmployee(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}
