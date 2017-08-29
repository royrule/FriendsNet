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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.PersonManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class PersonManagerImplTest {

	@InjectMocks
	private PersonManagerImpl personManagerImpl;

	@Mock
	private PersonDAO personDAOMock;

	private Person person;

	@Before
	public void init() {
		this.person = new Person();
		person.setName("asd");
		person.setId(1L);
	}

	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Person> expectPersons = new ArrayList<Person>();
		Mockito.when(personDAOMock.findAll()).thenReturn(expectPersons);

		// Act
		Iterable<Person> persons = personManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectPersons, persons);
	}

	@Test
	public void testFindById() {
		// Arrange
		final Person person = new Person();
		Mockito.when(personDAOMock.findById(1L)).thenReturn(person);
		// Act
		Person expectedPersonId = personManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(person, expectedPersonId);
	}

	// Save
	@Test
	public void testSave() {
		// Arrange
		final Person person = new Person();
		Mockito.when(personDAOMock.save(person)).thenReturn(person);
		// Act
		Person createPerson = personManagerImpl.save(person);
		// Assert
		Assert.assertEquals(person, expectedPersonId);

	}
	// @Test
	// public void testCreate() {
	// // Arrange
	// Mockito.doNothing().when(bookingDAOMock);
	// // Act
	// bookingDAOMock.create(expectedBooking);
	// // Assert
	// Mockito.verify(this.bookingDAOMock,
	// Mockito.times(1)).create(expectedBooking);
	//
	// }

	/*
	 * @Test public void testGetBookingDao() { // Act final BookingDAO result =
	 * this.bookingServiceImpl.getBookingDao(); // Assert
	 * Assert.assertEquals(bookingServiceImpl.getBookingDao(), result); }
	 * 
	 * @Test public void testSetBookingDao() { // Act
	 * bookingServiceImpl.setBookingDao(bookingDAOMock); // Assert
	 * Assert.assertEquals(bookingDAOMock, bookingServiceImpl.getBookingDao());
	 * 
	 * }
	 * 
	 * @Test public void testBookingServiceImpl() { // Assert
	 * Assert.assertNotNull(bookingServiceImpl); }
	 */
}
