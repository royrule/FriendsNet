package com.everis.alicante.courses.beca.summer17.FriendsNet.entityTests;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;

public class EventTest {

	private Event expectedEvent;

	private Long expectedIdEvent = 1L;

	private Long expectedIdPerson = 1L;

	private String expectedName = "Suicide";

	private Date expectedStartingDate;

	private Date expectedEndingDate;

	private byte[] expectedPicture = null;

	private EventType expectedType = EventType.FUNERAL;

	private Person personInEvent;

	@Before
	public void init() {
		this.expectedEvent = new Event();

		this.expectedEvent.setIdEvent(expectedIdEvent);
		this.expectedEvent.setIdPerson(expectedIdPerson);
		this.expectedEvent.setName(expectedName);
		this.expectedEvent.setStartingdate(expectedStartingDate);
		this.expectedEvent.setEndingDate(expectedEndingDate);
		this.expectedEvent.setPicture(expectedPicture);
		this.expectedEvent.setType(expectedType);

	}

	// Test group.
	@Test
	public void EventTest() {
		// Assert
		Assert.assertNotNull(expectedEvent);
	}

	// Test get idEvent.
	@Test
	public void testGetIdEvent() {
		// Act
		final Long result = this.expectedEvent.getIdEvent();
		// Assert
		Assert.assertEquals(expectedIdEvent, result);
	}

	// Test set idEvent.
	@Test
	public void testsetIdEvent() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setIdEvent(expectedIdEvent);
		// Assert
		Assert.assertEquals(expectedIdEvent, event.getIdEvent());

	}

	// Test get idPerson.
	@Test
	public void testGetIdPerson() {
		// Act
		final Long result = this.expectedEvent.getIdPerson();
		// Assert
		Assert.assertEquals(expectedIdPerson, result);
	}

	// Test set idPerson.
	@Test
	public void testSetIdPerson() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setIdPerson(expectedIdPerson);
		// Assert
		Assert.assertEquals(expectedIdPerson, event.getIdPerson());

	}

	// Test getName.
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedEvent.getName();
		// Assert
		Assert.assertEquals(expectedName, result);
	}

	// Test setName.
	@Test
	public void testSetName() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, event.getName());
	}

	// Test getStartingDate.
	@Test
	public void testGetStartingDate() {
		// Act
		final Date result = this.expectedEvent.getStartingdate();
		// Assert
		Assert.assertEquals(expectedStartingDate, result);
	}

	// Test setStartingDate.
	@Test
	public void testSetStartingDate() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setStartingdate(expectedStartingDate);
		// Assert
		Assert.assertEquals(expectedStartingDate, event.getStartingdate());
	}

	// Test getEndingDate.
	@Test
	public void testGetEndingDate() {
		// Act
		final Date result = this.expectedEvent.getStartingdate();
		// Assert
		Assert.assertEquals(expectedStartingDate, result);
	}

	// Test setEndingDate.
	@Test
	public void testSetEndingDate() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setEndingDate(expectedEndingDate);
		// Assert
		Assert.assertEquals(expectedEndingDate, event.getEndingDate());
	}

	// Test getEventType
	@Test
	public void testGetEventType() {
		// Act
		final EventType result = this.expectedEvent.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}

	// Test setEventType.
	@Test
	public void testsetEventType() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, event.getType());
	}

	// Test getPicture.
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedEvent.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}

	// Test setPicture.
	@Test
	public void testSetPicture() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, event.getPicture());
	}

}
