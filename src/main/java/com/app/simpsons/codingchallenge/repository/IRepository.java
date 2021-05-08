package com.app.simpsons.codingchallenge.repository;

import java.util.ArrayList;

import com.app.simpsons.codingchallenge.model.Data;


public interface IRepository<T> {

	Data<T> findAll();

	T findById(String id);

	ArrayList<T> deleteById(String id);
	
	T save(T p);

}