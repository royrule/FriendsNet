package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person implements FNEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;
	
	private String surname;

	private byte[] picture;

	private Set<Person> persons;
	

/*		public Picture(int pic) {
	        this.pic= new Double[12];

	   private List<Picture> picture;
*/
	//bi-directional many-to-one association to Booking
//	@OneToMany(mappedBy="client", cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
//	private Set<Booking> bookings;

	//bi-directional many-to-one association to Vehicle
//	@OneToMany(mappedBy="client", fetch=FetchType.EAGER ,cascade={CascadeType.ALL})
//	private Set<Vehicle> vehicles;

}
