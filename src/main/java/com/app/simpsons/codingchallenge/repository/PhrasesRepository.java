package com.app.simpsons.codingchallenge.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.simpsons.codingchallenge.model.Data;
import com.app.simpsons.codingchallenge.model.Phrases;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Repository
public class PhrasesRepository implements IRepository<Phrases> {
	@Autowired
	IDataBase<Phrases> pharasesUtility;

	@Override
	public Data<Phrases> findAll() {
		return pharasesUtility.get();
	}

	@Override
	public Phrases findById(String id) {
		return pharasesUtility.getById(id);
	}

	@Override
	public ArrayList<Phrases> deleteById(String id) {
		try {
			return pharasesUtility.detete(id);
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Phrases save(Phrases p) {
		try {
			System.out.println(p.get_id());
			return pharasesUtility.updateOrcreate(p.get_id(), p);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
