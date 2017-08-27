package com.everis.alicante.courses.beca.summer17.friendsnet.controller;


import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonController {
	
	public Iterable<Person> getAll();
	public Person getById(Long id);
	public Person create(Person person);
	public Person relatePersons(Long id, Iterable<Long> newFriendsIds);
	public void remove(Long id);
}

