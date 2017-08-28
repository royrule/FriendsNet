package com.everis.alicante.courses.beca.summer17.friendsnet.controller.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.EventController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;

@RestController
@RequestMapping("/event")
public class EventControllerImpl implements EventController{

	@Autowired
	EventManager eventManager;

	
	@Override
	@GetMapping
	public Iterable<Event> getAll() {

		return this.eventManager.findAll();
		
	}

	@Override
	@GetMapping("/{id}")
	public Event getById(Long id) {

		return eventManager.findById( id);
	}

	@Override
	@PostMapping
	public Event addPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/person/{id}")
	public Iterable<Event> getByPersonId(@PathVariable Long id) {

		return null;
	}

	@Override
	@PostMapping
	public Event create(@RequestBody Event e) {

		return this.eventManager.save(e);
	}

	@Override
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {

		this.eventManager.remove(eventManager.findById(id));
	}
	

}
