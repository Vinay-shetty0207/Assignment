package com.cg.smms.repository;

import com.cg.smms.entities.User;

public interface IUserRepository {
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
