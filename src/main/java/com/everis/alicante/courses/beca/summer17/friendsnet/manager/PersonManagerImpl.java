package com.everis.alicante.courses.beca.summer17.friendsnet.manager;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public class PersonManagerImpl implements  PersonManager{

	@Autowired
	private PersonDAO persondao;
	
	@Override
	
	public Person relatePersons(Long id, Iterable<Long> newFriendsIds) {
//		Person person = persondao.findById(id);
//		Set<Person> friends = (Set<Person>) persondao.findByIds(newFriendsIds);
//		person.getPersons().addAll(friends);
//		return person;
		return null;
	}

	@Override
	public Iterable<Person> findAll() {
		return persondao.findAll();
	}


	@Override
	public Person findById(Long id) {

		return persondao.findById(id);
	}

	@Override
	public Person save(Person e) {
		

		return persondao.save(e);
	}

	@Override
	public Iterable<Person> save(Iterable<Person> es) {

		return persondao.save(es);
	}


	@Override
	public Person update(Person e) {
		
		return persondao.update(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> es) {

		return persondao.update(es);
	}

	@Override
	public void remove(Person person) {
		
		persondao.remove(person);
	}
}