package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.event.spi.EventType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Event implements FNEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;
	
	private Date startingdate;


	private Date endingDate;
	
	private EventType type;

	private byte[] picture;

}
