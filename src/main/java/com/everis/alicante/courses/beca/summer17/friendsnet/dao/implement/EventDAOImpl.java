package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;

@Service
public class EventDAOImpl extends AbstractDAO<Event, Long>implements EventDAO{

}
