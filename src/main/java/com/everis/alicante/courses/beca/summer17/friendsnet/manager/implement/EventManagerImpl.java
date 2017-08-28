package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;

@Service
public class EventManagerImpl implements EventManager {

	@Autowired
	private EventDAO eventdao;

	@Override
	public Iterable<Event> findAll() {

		return eventdao.findAll();
	}

	@Override
	public Event findById(Long id) {

		return eventdao.findById(id);
	}

	@Override
	public Event save(Event e) {

		return eventdao.save(e);
	}

	@Override
	public Iterable<Event> save(Iterable<Event> es) {

		return eventdao.save(es);
	}

	@Override
	public Event update(Event e) {

		return eventdao.update(e);

	}

	@Override
	public Iterable<Event> update(Iterable<Event> es) {

		return eventdao.update(es);
	}

	@Override
	public void remove(Event event) {

		eventdao.remove(event);
	}

}
