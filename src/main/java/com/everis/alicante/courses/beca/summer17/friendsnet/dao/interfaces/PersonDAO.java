package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;


import com.everis.alicante.courses.beca.summer17.friendsnet.dao.EntityDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;


public interface PersonDAO extends EntityDAO<Person,Long> {

	
	public Person relatePersons(Long id, Iterable<Person> persons);
	
}
	