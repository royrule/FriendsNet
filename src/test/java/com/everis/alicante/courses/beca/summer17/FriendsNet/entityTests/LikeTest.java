package com.everis.alicante.courses.beca.summer17.FriendsNet.entityTests;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.LikeType;

import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LikeTest {

	private Like expectedLike;

	private Long expectedId = 1L;

	private Date expectedCreationDate;

	private LikeType expectedType = LikeType.PEACEIMOUT;

	private Like expectedlikeOfPerson;

	private Like expectedLikeOfPost;

	@Before
	public void init() {
		this.expectedLike = new Like();
		this.expectedLike.setId(expectedId);
		this.expectedLike.setCreationDate(expectedCreationDate);
		this.expectedLike.setType(expectedType);
		this.expectedLike.setLikeOfPerson(expectedlikeOfPerson);
		this.expectedLike.setLikeOfPost(expectedLikeOfPost);

	}

	// Test group.
	@Test
	public void testLike() {
		// Assert
		Assert.assertNotNull(expectedLike);
	}

	// Test get id.
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedLike.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}

	// Test set id.
	@Test
	public void testSetId() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, like.getId());
	}

	// Test getCreationDate.
	@Test
	public void testGetCreationDate() {
		// Act
		final Date result = this.expectedLike.getCreationDate();
		// Assert
		Assert.assertEquals(expectedLike, result);
	}

	// Test setCreationDate.
	@Test
	public void testSetCreationDate() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setCreationDate(expectedCreationDate);
		// Assert
		Assert.assertEquals(expectedCreationDate, like.getCreationDate());
	}

	// Test getType.
	@Test
	public void testGetType() {
		// Act
		final LikeType result = this.expectedLike.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}

	// Test setType.
	@Test
	public void testType() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, like.getType());
	}

	// Test getPersonsLike.
	@Test
	public void testPersonsLike() {
		// Act
		final Like result = this.expectedLike.getLikeOfPerson();
		// Assert
		Assert.assertEquals(expectedlikeOfPerson, result);
	}

	// Test setPersonsLike.
	@Test
	public void testSetPersonsLike() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setLikeOfPerson(expectedlikeOfPerson);
		// Assert
		Assert.assertEquals(expectedlikeOfPerson, like.getLikeOfPerson());
	}

	// Test getLikeOfPost.
	@Test
	public void testGetLikeOfPost() {
		// Act
		final Like result = this.expectedLike.getLikeOfPost();
		// Assert
		Assert.assertEquals(expectedLikeOfPost, result);
	}

	// Test setLikeOfPost.
	@Test
	public void testSetLikeOfPost() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setLikeOfPost(expectedLikeOfPost);
		// Assert
		Assert.assertEquals(expectedLikeOfPost, like.getLikeOfPost());
	}

}
