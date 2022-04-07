package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Item;

public class IItemRepositoryImpl implements IItemRepository 
{
	private EntityManager entityManager;
	public IItemRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		Item update = entityManager.merge(item);
		return update;
	}

	@Override
	public Item searchItem(long id) {
		Item search = entityManager.find(Item.class, id);
		return search;
	}

	@Override
	public Item deleteItem(long id) {
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
