package com.everis.alicante.courses.beca.summer17.FriendsNet.ManagerTests;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
		person.setName("");
		person.setId(1L);

	}

	// Test findAll
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

	// test FindById
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

	//Test inutil Save
	@Test
	public void testSave() {
		// Arrange
		final Person newPerson = new Person();
		Mockito.when(personDAOMock.save(person)).thenReturn(newPerson);
		// Act
		Person expectedPerson = personManagerImpl.save(person);
		// Assert
		Assert.assertEquals(person, expectedPerson);
	}

	// testDelete
	@Test
	public void testDelete() {
		// Arrange
		final Person newPerson = new Person();
		Mockito.when(this.personManagerImpl.findById(1L)).thenReturn(this.person);
		// Act
		personDAOMock.remove(newPerson);
		// Assert
		Mockito.verify(this.personManagerImpl, Mockito.times(1)).remove(person);
	}

	//
//	// testUpdate
//	@Test
//	public void testUpdate() {
//		// Arrange
//		Person newPerson = new Person();
//		Mockito.when(this.personDAOMock.update(newPerson).thenReturn(this.person);
//		// Act
//		personDAOMock.update(newPerson);
//		// Assert
//		Assert.assertNotSame(newPerson, this.person);
//		 Mockito.verify(this.entityTransaction, Mockito.times(1)).begin();
//		 Mockito.verify(this.entityManager, Mockito.times(1)).merge(newPerson);
//		 Mockito.verify(this.entityTransaction, Mockito.times(1)).commit();
//	}
//}

// Test Save
// @Test
// public void testSave() {
// // Arrange
// Mockito.when(personDAOMock.save(person)).thenReturn(person);
// // Act
// Person expectedNewPerson = personManagerImpl.save(person);
// // Assert
// Assert.assertEquals(person, expectedNewPerson);
//
// }
// Mockito.doNothing().when(personDAOMock);

// @Test
// public void testCreate() {
// // Arrange
// Person newPerson = new Person();
//
// // Act
// final Person expectedPerson = personDAOMock.save(newPerson);
// // Assert
// Mockito.verify(this.personDAOMock, Mockito.times(1)).save(newPerson);
//
// }
// testCreate

// @Test
// public void testCreate() {
// Person newPerson = new Person();
// person.setName("Harley");
// newPerson.setName("Joker");
// Mockito.when(this.personManagerImpl.save(person)).thenReturn(this.person);//
// Act
// personDAOMock.save(person);
// Mockito.verify(this.personDAOMock, Mockito.times(1)).save(newPerson);
// }

// @Test
// public void testCreate() {
// Person newPerson = new Person();
// newPerson.setName("asd");
// Mockito.when(this.personManagerImpl.save(newPerson)).thenReturn(this.person);
// personDAOMock.save(newPerson);
// Mockito.verify(this.personDAOMock, Mockito.times(1)).save(newPerson);
// }
}