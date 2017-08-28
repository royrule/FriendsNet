package com.everis.alicante.courses.beca.summer17.friendsnet.manager.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PostManager;

@Service
public class PostManagerImpl implements PostManager {

	@Autowired
	private PostDAO postdao;

	@Override
	public Post addLikes(boolean like) {

		return postdao.addLikes(like);
	}

	@Override
	public Iterable<Post> findAll() {

		return postdao.findAll();
	}

	@Override
	public Post findById(Long id) {

		return postdao.findById(id);
	}

	@Override
	public Post save(Post e) {

		return postdao.save(e);
	}

	@Override
	public Iterable<Post> save(Iterable<Post> es) {

		return postdao.save(es);
	}

	@Override
	public Post update(Post e) {

		return postdao.update(e);

	}

	@Override
	public Iterable<Post> update(Iterable<Post> es) {

		return postdao.update(es);
	}

	@Override
	public void remove(Post post) {

		postdao.remove(post);

	}

}
