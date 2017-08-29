package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post implements FNEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String text;

	private Date creationDate;

	private PostType type;

	private byte[] picture;

	// Post-Person
	@OneToMany(mappedBy = "postPerson", fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JsonIgnore
	private Person personInPost;

	// Post-Event
	@OneToMany(mappedBy = "postEvent", fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JsonIgnore
	private Person eventInPost;

}
