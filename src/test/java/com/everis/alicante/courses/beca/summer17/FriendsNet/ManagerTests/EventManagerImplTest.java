package com.everis.alicante.courses.beca.summer17.FriendsNet.ManagerTests;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.EventManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class EventManagerImplTest {
	@InjectMocks
	private EventManagerImpl eventManagerImpl;

	@Mock
	private EventDAO eventDAOMock;

	private Event event;

	@Before
	public void init() {
		this.event = new Event();
		event.setName("");
		event.setIdEvent(1L);

	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Event> expectEvents = new ArrayList<Event>();
		Mockito.when(eventDAOMock.findAll()).thenReturn(expectEvents);

		// Act
		Iterable<Event> events = eventManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectEvents, events);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Event event = new Event();
		Mockito.when(eventDAOMock.findById(1L)).thenReturn(event);
		// Act
		Event expectedEventId = eventManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(event, expectedEventId);
	}

}
