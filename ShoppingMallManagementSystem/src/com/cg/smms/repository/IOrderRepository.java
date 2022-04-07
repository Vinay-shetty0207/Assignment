package com.cg.smms.repository;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;

public interface IOrderRepository {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public OrderDetails deleteOrder(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
