package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Shop;

public class IShopRepositoryImpl implements IShopRepository
{
	private EntityManager entityManager;
	public IShopRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		Shop update = entityManager.merge(shop);
		return update;
	}

	@Override
	public Shop searchShopById(long id) {
		Shop search = entityManager.find(Shop.class, id);
		return search;
	}

	@Override
	public boolean deleteShop(long id) {
		entityManager.remove(id);
		return false;
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
