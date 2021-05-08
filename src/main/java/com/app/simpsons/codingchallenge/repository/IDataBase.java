package com.app.simpsons.codingchallenge.repository;

import java.util.ArrayList;

import com.app.simpsons.codingchallenge.model.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IDataBase<T> {

	Data<T> get();

	T getById(String id);

	T updateOrcreate(String id, Object obj) throws JsonMappingException, JsonProcessingException;

	ArrayList<T> detete(String id) throws JsonMappingException, JsonProcessingException;

}