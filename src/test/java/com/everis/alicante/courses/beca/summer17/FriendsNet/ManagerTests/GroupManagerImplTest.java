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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.GroupManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class GroupManagerImplTest {

	@InjectMocks
	private GroupManagerImpl groupManagerImpl;

	@Mock
	private GroupDAO groupDAOMock;

	private Group group;

	@Before
	private void init() {
		this.group = new Group();
		group.setName("");
		group.setId(1L);

	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Group> expectGroups = new ArrayList<Group>();
		Mockito.when(groupDAOMock.findAll()).thenReturn(expectGroups);

		// Act
		Iterable<Group> groups = groupManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectGroups, groups);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Group group = new Group();
		Mockito.when(groupDAOMock.findById(1L)).thenReturn(group);
		// Act
		Group expectedGroupId = groupManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(group, expectedGroupId);
	}

}
