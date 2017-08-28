package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement;


import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public class PersonDAOImpl extends AbstractDAO<Person, Long> implements PersonDAO {

	@Override
	public Person relatePersons(Long id, Iterable<Person> persons) {
		return null;
	}

}