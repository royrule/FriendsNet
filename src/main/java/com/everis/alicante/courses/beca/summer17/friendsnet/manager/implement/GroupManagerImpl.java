package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.GroupManager;

@Service
public class GroupManagerImpl implements GroupManager {

	@Autowired
	private GroupDAO groupdao;

	@Override
	public Group addPersons(Iterable<Person> persons) {
		return null;
	}

	@Override
	public Iterable<Group> findAll() {
		return groupdao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return groupdao.findById(id);
	}

	@Override
	public Group save(Group e) {

		return groupdao.save(e);
	}

	@Override
	public Iterable<Group> save(Iterable<Group> es) {

		return groupdao.save(es);
	}

	@Override
	public Group update(Group e) {

		return groupdao.update(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> es) {

		return groupdao.update(es);
	}

	@Override
	public void remove(Group group) {

		groupdao.remove(group);
	}

	@Override
	public Group relate(Long id, Iterable<Long> newPersonGroupsIds) {
		Group group = groupdao.findById(id);
		Set<Group> friends = (Set<Group>) groupdao.findByIds(newPersonGroupsIds);
		group.getGroups().addAll(friends);
		return group;

	}
}