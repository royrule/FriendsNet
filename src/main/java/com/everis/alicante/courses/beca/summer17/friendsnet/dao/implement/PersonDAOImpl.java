package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class PersonDAOImpl extends AbstractDAO<Person, Long> implements PersonDAO {
	
	public PersonDAOImpl() {}
	
	public PersonDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

}
