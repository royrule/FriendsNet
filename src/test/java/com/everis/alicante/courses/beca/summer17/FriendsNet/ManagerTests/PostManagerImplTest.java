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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement.PostManagerImpl;


@RunWith(MockitoJUnitRunner.class)
public class PostManagerImplTest {

	@InjectMocks
	private PostManagerImpl postManagerImpl;
	
	@Mock
	private PostDAO postDAOMock;

	private Post post;

	@Before
	public void init() {
		this.post = new Post();
		post.setId(1L);
	}
	

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Post> expectPosts = new ArrayList<Post>();
		Mockito.when(postDAOMock.findAll()).thenReturn(expectPosts);

		// Act
		Iterable<Post> posts = postManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectPosts, posts);
	}
	
	// Test findById
	@Test
	public void testFindById() {
		// Arrange
		Post post = new Post();
		Mockito.when(postDAOMock.findById(1L)).thenReturn(post);

		// Act
		Post expectedPostId = postManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(post, expectedPostId);
	}





}
