package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "group")
public class Group implements FNEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7545136096560176081L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private byte[] picture;

	private Set<Group> groups;

	// Group-Person
	@ManyToMany(mappedBy = "groupPerson", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE })
	@JsonIgnore
	private Set<Person> personsGroup = new HashSet<>();

}
