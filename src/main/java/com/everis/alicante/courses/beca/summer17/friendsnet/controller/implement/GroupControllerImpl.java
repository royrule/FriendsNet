package com.everis.alicante.courses.beca.summer17.friendsnet.controller.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.GroupController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.GroupManager;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PersonManager;

@RestController
@RequestMapping("/group")
public class GroupControllerImpl implements GroupController{

	@Autowired
	GroupManager groupManager;
	

	@Autowired
	PersonManager personManager;
	
	@Override
	@GetMapping
	public Iterable<Group> getAll() {

		return this.groupManager.findAll();
	}

	@Override
	@GetMapping("/{id}")
	public Group getById(Long id) {

		return groupManager.findById(id);
	}

	@Override
	@PostMapping
	public Group create(@RequestBody Group e) {

		return this.groupManager.save(e);

	}


	@Override
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		
		this.groupManager.remove(groupManager.findById(id));
		
	}

	@Override
	@GetMapping("/person/{id}")
	public Group getByPersonId(@PathVariable Long id) {

		return null;
	}

	@PostMapping("/{id}/relate")
	public Person relatePersons(@PathVariable Long id,@RequestBody Iterable<Long> newFriendsIds) {
			
		return this.personManager.relatePersons(id, newFriendsIds);
		
		}

}
