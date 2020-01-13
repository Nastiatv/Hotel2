package com.runa.hotel.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.runa.hotel.api.dao.IServiceDao;
import com.runa.hotel.entities.Service;

public class ServiceDao extends AGenericDao<Service> implements IServiceDao {

	public ServiceDao() {
		super(Service.class);
	}

	@Override
	public Service getById(Long id) {
		try {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Service> cq = cb.createQuery(getGenericClass());
		Root<Service> rootEntry = cq.from(Service.class);
		CriteriaQuery<Service> all =cq.select(rootEntry).where(cb.equal(rootEntry, id));
		TypedQuery<Service> result = entityManager.createQuery(all);
		return result.getSingleResult();}
		catch(NoResultException e) {
			return null;
		}
	}
}
