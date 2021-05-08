package com.app.simpsons.codingchallenge.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.simpsons.codingchallenge.model.Data;
import com.app.simpsons.codingchallenge.model.Phrases;
import com.app.simpsons.codingchallenge.repository.IService;

@RestController
@RequestMapping("/api/v1/simpsonsphrases/phrases")
public class SimpsonsPhrasesController {
	
	@Autowired
	IService<Phrases> phrasesService;
	
	@GetMapping("/")
	public Data<Phrases> GetAllThePhrases() {
		return phrasesService.findAll();
	}

	@GetMapping("/{id}")
	public Phrases GetSinglePhrases(@PathVariable String id) {
		return phrasesService.findById(id);
	}
	
	// Create 
	@PostMapping("/")
	Phrases newEmployee(@RequestBody Phrases newPhrases) {
	
	    return phrasesService.save(newPhrases);
	  }
	
	//Update 
	 @PutMapping("/{id}")
	 public Phrases replaceEmployee(@RequestBody Phrases p, @PathVariable String id) {
		return phrasesService.save(p);
	 }
	
	 //Delete
	@DeleteMapping("/{id}")
	  ArrayList<Phrases> deleteEmployee(@PathVariable String id) {
		return phrasesService.deleteById(id);
	  }

}

