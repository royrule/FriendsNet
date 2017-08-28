package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Group implements FNEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;
	
	private byte[] picture;

}
