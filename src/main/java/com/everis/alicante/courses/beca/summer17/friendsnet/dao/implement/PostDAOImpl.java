package com.everis.alicante.courses.beca.summer17.friendsnet.dao.implement;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;

@Service
public class PostDAOImpl extends AbstractDAO<Post, Long> implements PostDAO {
	public PostDAOImpl() {}
	
	public PostDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Post addLikes(boolean Like) {
		return null;
	}

}
