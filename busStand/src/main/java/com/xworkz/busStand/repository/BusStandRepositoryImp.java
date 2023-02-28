package com.xworkz.busStand.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.busStand.dto.entity.BusStandEntityDTO;

@Repository
public class BusStandRepositoryImp implements BusStandRepository {

	public BusStandRepositoryImp() {
		System.out.println("Inside BusStandRepositoryImp " + getClass().getSimpleName());
	}

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(BusStandEntityDTO entityDTO) {
		System.out.println("Inside save method");
		EntityManager entityManager = this.factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entityDTO);
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public BusStandEntityDTO searchById(int id) {
		System.out.println("inside searchById " + id);
		EntityManager entityManager = this.factory.createEntityManager();
		BusStandEntityDTO busStandEntityDTO = entityManager.find(BusStandEntityDTO.class, id);
		entityManager.close();
		return busStandEntityDTO;

	}

}
