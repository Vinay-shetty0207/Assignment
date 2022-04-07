package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.OrderDetails;

public class IOrderRepositoryimpl implements IOrderRepository
{
	private EntityManager entityManager;
	public IOrderRepositoryimpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

	@Override
	public OrderDetails searchOrder(long id) {
		OrderDetails details = entityManager.find(OrderDetails.class, id);
		return details;
	}

	@Override
	public OrderDetails deleteOrder(long id) {
		entityManager.remove(id);
		return null;
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
