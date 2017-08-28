package com.everis.alicante.courses.beca.summer17.friendsnet.controller.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.PostController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PostManager;

@RestController
@RequestMapping("/post")
public class PostControllerImpl implements PostController {

	@Autowired
	PostManager postManager;
	
	
	
	@Override
	@GetMapping
	public Iterable<Post> getAll() {

		return this.postManager.findAll();
	}

	@Override
	@GetMapping("/{id}")
	public Post getById(Long id) {

		return postManager.findById(id);
	}

	
	
	@Override
	@PostMapping
	public Post create(@RequestBody Post e) {

		return this.postManager.save(e);
	}

	@Override
	@GetMapping("/person/{id}")
	public Post getByPersonId(@PathVariable Long id) {
	return null;
	}

	@Override
	@DeleteMapping("/{id}")
	public void remove(Long id) {		
		this.postManager.remove(postManager.findById(id));
	}
	

}
