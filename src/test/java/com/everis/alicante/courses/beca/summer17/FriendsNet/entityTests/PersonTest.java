package com.everis.alicante.courses.beca.summer17.FriendsNet.entityTests;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;

public class PersonTest {
	private Person expectedPerson;

	private Long expectedId = 1L;

	private String expectedName = "Bruce";

	private String expectedSurname = "Wayne";

	private byte[] expectedPicture = null;

	private Set<Group> expectedGroups = new HashSet<Group>();

	private Set<Person> expectedFriends = new HashSet<Person>();

	private Set<Event> expectedEvents = new HashSet<Event>();

	private Set<Like> expectedLikes = new HashSet<>();

	private Set<Post> expectedPosts = new HashSet<>();

	@Before
	public void init() {
		this.expectedPerson = new Person();

		this.expectedPerson.setId(expectedId);
		this.expectedPerson.setName(expectedName);
		this.expectedPerson.setSurname(expectedSurname);
		this.expectedPerson.setPicture(expectedPicture);
		this.expectedPerson.setPosts(expectedPosts);
		this.expectedPerson.setFriends(expectedFriends);
		this.expectedPerson.setEvents(expectedEvents);
		this.expectedPerson.setGroups(expectedGroups);
		this.expectedPerson.setLikes(expectedLikes);
	}

	// Test person.
	@Test
	public void testPerson() {
		// Assert
		Assert.assertNotNull(expectedPerson);
	}

	// Test get id.
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedPerson.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}

	// Test set id.
	@Test
	public void testSetId() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, person.getId());
	}

	// Test get name.
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedPerson.getName();
		// Assert
		Assert.assertEquals(expectedName, result);
	}

	// Test set name.
	@Test
	public void testSetName() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, person.getName());
	}

	// Test get surname.
	@Test
	public void testGetSurname() {
		// Act
		final String result = this.expectedPerson.getSurname();
		// Assert
		Assert.assertEquals(expectedSurname, result);
	}

	// Test set surname.
	@Test
	public void testSetSurname() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setSurname(expectedSurname);
		// Assert
		Assert.assertEquals(expectedSurname, person.getSurname());
	}

	// Test get picture.
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedPerson.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}

	// Test set picture.
	@Test
	public void testSetPicture() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, person.getPicture());
	}

	// Test get persons.
	@Test
	public void testGetPersons() {
		// Act
		final Set<Person> result = this.expectedPerson.getFriends();
		// Assert
		Assert.assertEquals(expectedFriends, result);
	}

	// Test set persons.
	@Test
	public void testSetPersons() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setFriends(expectedFriends);
		// Assert
		Assert.assertEquals(expectedFriends, person.getFriends());
	}

	// Test get groups.
	@Test
	public void testGetGroups() {
		// Act
		final Set<Group> result = this.expectedPerson.getGroups();
		// Assert
		Assert.assertEquals(expectedGroups, result);
	}

	// Test set groups.
	@Test
	public void testSetGroups() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setGroups(expectedGroups);
		// Assert
		Assert.assertEquals(expectedGroups, person.getGroups());
	}

	// Test get events.
	@Test
	public void testGetEvents() {
		// Act
		final Set<Event> result = this.expectedPerson.getEvents();
		// Assert
		Assert.assertEquals(expectedEvents, result);
	}

	// Test set events.
	@Test
	public void testSetEvents() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setEvents(expectedEvents);
		// Assert
		Assert.assertEquals(expectedEvents, person.getEvents());
	}

	// Test get post.
	@Test
	public void testGetPost() {
		// Act
		final Set<Post> result = this.expectedPerson.getPosts();
		// Assert
		Assert.assertEquals(expectedPosts, result);
	}

	// Test set post.
	@Test
	public void testSetPost() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setPosts(expectedPosts);
		// Assert
		Assert.assertEquals(expectedPosts, person.getPosts());
	}

	// Test get like.
	@Test
	public void testGetLike() {
		// Act
		final Set<Like> result = this.expectedPerson.getLikes();
		// Assert
		Assert.assertEquals(expectedLikes, result);
	}

	// Test set like.
	@Test
	public void testSetLike() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setLikes(expectedLikes);
		// Assert
		Assert.assertEquals(expectedLikes, person.getLikes());
	}
}
