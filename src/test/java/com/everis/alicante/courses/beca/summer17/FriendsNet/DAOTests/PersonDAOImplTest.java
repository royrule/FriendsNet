package com.everis.alicante.courses.beca.summer17.FriendsNet.DAOTests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement.PersonDAOImpl;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

@RunWith(MockitoJUnitRunner.class)
public class PersonDAOImplTest {

	private PersonDAOImpl personDAOImpl;

	@Mock
	private EntityManager entityManager;

	@Before
	public void init() {
		this.entityManager = Mockito.mock(EntityManager.class);
		this.personDAOImpl = new PersonDAOImpl(this.entityManager);
	}

	@Test
	public void testFindById() {

		// Arrange
		Person expectedPerson = new Person();
		Mockito.when(this.entityManager.find(Person.class, 1L)).thenReturn(expectedPerson);
		// Act
		Person person = personDAOImpl.findById(1L);
		// Assert
		Assert.assertEquals(expectedPerson, person);
	}
	
	// Get testCreatePerson
	@Test
	public void testGetCreatePerson() {
		// Arrange
		Person newPerson = new Person();
		// Act
		final Person persona = personDAOImpl.save(newPerson);
		// Assert
		Mockito.verify(entityManager, Mockito.times(1)).persist(newPerson);
	}
	
}
