package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event implements FNEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEvent;

	private Long idPerson;

	private String name;

	private Date startingdate;

	private Date endingDate;

	private EventType type;

	private byte[] picture;

	// Event-Post
	@OneToMany(mappedBy = "postinEvent", fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JsonIgnore
	private Set<Post> posts = new HashSet<>();// no se repiten

	// Event-Person
	@ManyToOne(cascade = { CascadeType.ALL })
	@JsonIgnore
	private Person personInEvent;

}
