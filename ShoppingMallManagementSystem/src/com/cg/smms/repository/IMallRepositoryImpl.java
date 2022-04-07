package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Mall;

public class IMallRepositoryImpl implements IMallRepository
{
	private EntityManager entityManager;
	public IMallRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	
	
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		Mall update = entityManager.merge(mall);
		return update;
	}

	@Override
	public Mall searchMall(long id) {
		Mall search = entityManager.find(Mall.class, id);
		return search;
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
