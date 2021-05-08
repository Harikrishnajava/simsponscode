package com.app.simpsons.codingchallenge.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.app.simpsons.codingchallenge.model.Data;

@Repository
public interface IService<T> {

	Data<T> findAll();
	 
	T findById(String id);

	ArrayList<T> deleteById(String id);
	
	T save(T p);

}