package com.cg.smms.service;

import com.cg.smms.entities.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(long id);
	public boolean  deleteEmployee(long id);

}
