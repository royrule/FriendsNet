package com.everis.alicante.courses.beca.summer17.FriendsNet.entityTests;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;

public class PostTest {

	private Post expectedPost;

	private Long expectedId = 1L;

	private String expectedText = "Kiara";

	private byte[] expectedPicture = null;

	private Date expectedCreationDate;

	private PostType expectedType;

	private Person expectedPersonInPost;

	@Before
	public void init() {
		this.expectedPost = new Post();

		this.expectedPost.setId(expectedId);
		this.expectedPost.setText(expectedText);
		this.expectedPost.setPicture(expectedPicture);
		this.expectedPost.setCreationDate(expectedCreationDate);
		this.expectedPost.setType(expectedType);
		this.expectedPost.setPersonInPost(expectedPersonInPost);

	}

	// Test post.
	@Test
	public void testPost() {
		// Assert
		Assert.assertNotNull(expectedPost);
	}

	// Test getId.
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedPost.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}

	// Test setId.
	@Test
	public void testSetId() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, post.getId());
	}

	// Test getText
	@Test
	private void testGetText() {
		// Act
		final String result = this.expectedPost.getText();
		// Assert
		Assert.assertEquals(expectedText, result);
	}

	// Test getText.
	@Test
	public void testSetText() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setText(expectedText);
		// Assert
		Assert.assertEquals(expectedText, post.getText());
	}

	// Test getPicture.
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedPost.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}

	// Test setPicture.
	@Test
	public void testSetPicture() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, post.getPicture());
	}

	// Test getCreationDate.
	@Test
	public void testGetCreationDate() {
		// Act
		final Date result = this.expectedPost.getCreationDate();
		// Assert
		Assert.assertEquals(expectedCreationDate, result);
	}

	// Test setCreationDate.
	@Test
	public void testSetCreationDate() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setCreationDate(expectedCreationDate);
		// Assert
		Assert.assertEquals(expectedCreationDate, post.getCreationDate());
	}

	// Test getType.
	@Test
	public void testGetType() {
		// Act
		final PostType result = this.expectedPost.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}

	// Test setType.
	@Test
	public void testSetType() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, post.getType());
	}

	// Test getPersonInPost.
	@Test
	public void testGetPersonInPost() {
		// Act
		final Person result = this.expectedPost.getPersonInPost();
		// Assert
		Assert.assertEquals(expectedPersonInPost, result);
	}

	// Test setType.
	@Test
	public void testSetPersonInPost() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setPersonInPost(expectedPersonInPost);
		// Assert
		Assert.assertEquals(expectedPersonInPost, post.getPersonInPost());
	}

}
