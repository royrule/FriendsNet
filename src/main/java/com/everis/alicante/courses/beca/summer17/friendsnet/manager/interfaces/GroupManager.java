package com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.Manager;

public interface GroupManager extends Manager<Group, Long> {

	public Group addPersons(Iterable<Person> persons);
	
	public Group relate(Long id, Iterable<Long> newFriendsIds);

}
