package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;


public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

	Iterable<E> findAll();

	E findById(ID id);

	Iterable<E> findByIds(Iterable<ID> ids);

	E save(E e);

	Iterable<E> save(Iterable<E> es);

	E update(E e);

	Iterable<E> update(Iterable<E> es);

	void remove(E e);

}
