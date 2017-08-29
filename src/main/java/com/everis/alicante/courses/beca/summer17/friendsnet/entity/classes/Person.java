package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person implements FNEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String surname;

	private byte[] picture;

	private Set<Person> persons;

	// PersonFriends
	@OneToMany(mappedBy = "friends", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Person> friends = new HashSet<>();

	// Person-Group
	@ManyToMany(mappedBy = "personsInGroups", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Group> groups = new HashSet<>();

	// Person-Like
	@OneToMany(mappedBy = "likeOfPerson", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Like> likes = new HashSet<>();

	// Person-Post
	@OneToMany(mappedBy = "postOfPerson", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Post> posts = new HashSet<>();

	// Person-Event
	@OneToMany(mappedBy = "personInEvent", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Event> events = new HashSet<>();

}
