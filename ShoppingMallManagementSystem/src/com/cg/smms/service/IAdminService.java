package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;

public interface IAdminService {
	public boolean approveNewShop(Shop shop);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
