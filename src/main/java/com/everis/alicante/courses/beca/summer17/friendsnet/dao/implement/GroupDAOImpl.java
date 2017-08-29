package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

@Service
public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO {
	public GroupDAOImpl() {
	}

	public GroupDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Group addPersons(Iterable<Person> group) {
		return null;
	}

}
