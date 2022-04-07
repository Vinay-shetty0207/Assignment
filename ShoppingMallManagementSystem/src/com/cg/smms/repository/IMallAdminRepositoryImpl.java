package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository
{
	private EntityManager entityManager;
	public IMallAdminRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		MallAdmin update = entityManager.merge(mallAdmin);
		return update;
	}

	@Override
	public MallAdmin deleteMallAdmin(long id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public MallAdmin searchMallAdmin(long id) {
		entityManager.find(MallAdmin.class, id);
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
