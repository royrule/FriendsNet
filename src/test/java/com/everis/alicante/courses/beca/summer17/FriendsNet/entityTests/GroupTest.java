package com.everis.alicante.courses.beca.summer17.FriendsNet.entityTests;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

import org.junit.Assert;

public class GroupTest {
	private Group expectedGroup;

	private Long expectedId = 1L;

	private String expectedName = "SuicideSquad";

	private byte[] expectedPicture = null;

	private Set<Group> expectedGroups;

	private Set<Person> expectedPersonsGroup = new HashSet<Person>();

	@Before
	public void init() {
		this.expectedGroup = new Group();

		this.expectedGroup.setId(expectedId);
		this.expectedGroup.setName(expectedName);
		this.expectedGroup.setPicture(expectedPicture);
		this.expectedGroup.setPersonsGroup(expectedPersonsGroup);
		this.expectedGroup.setGroups(expectedGroups);

	}

	// Test group.
	@Test
	public void testGroup() {
		// Assert
		Assert.assertNotNull(expectedGroup);
	}

	// Test get id.
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedGroup.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}

	// Test set id.
	@Test
	public void testSetId() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, group.getId());
	}

	// Test get name.
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedGroup.getName();
		// Assert
		Assert.assertEquals(expectedGroup, result);
	}

	// Test set name.
	@Test
	public void testSetName() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, group.getName());
	}

	// Test get picture.
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedGroup.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}

	// Test set picture.
	@Test
	public void testSetPicture() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, group.getPicture());
	}

	// Test getPersonsGroup
	@Test
	public void testGetPersonsGroup() {
		// Act
		final Set<Person> result = this.expectedGroup.getPersonsGroup();
		// Assert
		Assert.assertEquals(expectedPersonsGroup, result);
	}

	// Test setPersonsGroup
	@Test
	public void testSetPersonsGroup() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setPersonsGroup(expectedPersonsGroup);
		// Assert
		Assert.assertEquals(expectedPersonsGroup, group.getPersonsGroup());

	}

	// Test getGroups
	@Test
	public void testGetGroups() {
		// Act
		final Set<Group> result = this.expectedGroup.getGroups();
		// Assert
		Assert.assertEquals(expectedGroups, result);
	}

	// Test setGroups
	@Test
	public void testSetGroups() {
		// Arrange
		final Group group = new Group();
		// Act
		group.setGroups(expectedGroups);
		// Assert
		Assert.assertEquals(expectedGroups, group.getGroups());

	}
}
