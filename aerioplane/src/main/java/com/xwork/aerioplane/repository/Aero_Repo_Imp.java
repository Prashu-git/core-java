package com.xwork.aerioplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xwork.aerioplane.DTO.entity.AeroplaneEntityDto;

@Repository
public class Aero_Repo_Imp implements Aer_Reop {

	@Autowired
	public EntityManagerFactory factory;

	public Aero_Repo_Imp() {
		System.out.println("inside Aero_Repo_Imp " + getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntityDto aeroplaneEntityDto) {

		System.out.println("inside save method");

		EntityManager entityManager = this.factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		entityManager.persist(aeroplaneEntityDto);

		transaction.commit();

		entityManager.close();

		return false;
	}

	@Override
	public AeroplaneEntityDto findById(int id) {
		System.out.println("inside findById" + id);

		EntityManager entityManager = this.factory.createEntityManager();
		AeroplaneEntityDto aeroplaneEntityDto = entityManager.find(AeroplaneEntityDto.class, id);
		entityManager.close();
		return aeroplaneEntityDto;
	}

}
