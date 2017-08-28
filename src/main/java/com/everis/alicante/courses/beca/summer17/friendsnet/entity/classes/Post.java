package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post implements FNEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String text;
	
	private Date creationDate;
	
	private PostType type;

	private byte[] picture;
	
}
