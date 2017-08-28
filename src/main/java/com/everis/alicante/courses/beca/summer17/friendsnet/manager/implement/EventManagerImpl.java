package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;

@Service
public class EventManagerImpl implements EventManager{

	@Autowired
	EventDAO eventdao;
	
	@Override
	public Iterable<Event> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event save(Event e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Event> save(Iterable<Event> es) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event update(Event e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Event> update(Iterable<Event> es) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Event e) {
		// TODO Auto-generated method stub
		
	}

}
