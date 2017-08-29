package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

public interface Manager <E extends FNEntity, ID extends Serializable> {

	public Iterable<E> findAll();
		
	public E findById(ID id);
	
	public E save(E e);
	
	public Iterable<E> save(Iterable <E> es);
	
	public E update(E e);
	
	public Iterable<E> update(Iterable <E> es);

	public void remove(E e);

}
