package com.everis.alicante.courses.beca.summer17.friendsnet.controller.implement;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.PersonController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonControllerImpl implements PersonController {
	
	@Autowired
	PersonManager personManager;

	@Override
	@GetMapping
	public Iterable<Person> getAll() {
		
		return this.personManager.findAll();
	}

	@Override
	@GetMapping("/{id}")
	public Person getById(Long id) {

		return personManager.findById(id);
	}

	@Override
	@PostMapping
	public Person create(@RequestBody Person e) {//esta etiqueta sirve para que el json que viene en el cuerpo se tiene que parsear en Person

		return this.personManager.save(e);
		
	}

	@PostMapping("/{id}/relate")
	public Person relatePersons(@PathVariable Long id,@RequestBody Iterable<Long> newFriendsIds) {
		
		return this.personManager.relatePersons(id, newFriendsIds);
	
	}
	
	@Override
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		
		this.personManager.remove(personManager.findById(id));

	}


}
