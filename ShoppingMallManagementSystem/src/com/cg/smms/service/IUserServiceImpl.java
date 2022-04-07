package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IEmployeeRepositoryImpl;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService{
	
	private IUserRepository repository;
	public IUserServiceImpl()
	{
		repository=new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User updateUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User login(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logOut() {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}
