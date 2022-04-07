package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.User;

public interface ICustomerService {
public Item orderItem(Item item);
public List<Item> searchItem(String itemName);
public Mall searchMall(long id);
public boolean cancelOrder(long orderId);
public User login(User user);
public boolean logout();
}
