package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;

public interface EventController {

	public Iterable<Event> getAll();

	public Event getById(Long idEvent);

	public Event addPerson(Long idPerson, Long idEvent);

	public Iterable<Event> getByPersonId(Long idPerson);

	public Event create(Event e);

	public void remove(Long idEvent);
}
