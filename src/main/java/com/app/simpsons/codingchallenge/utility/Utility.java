package com.app.simpsons.codingchallenge.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


public abstract class Utility {
	protected ObjectMapper objMapper;
	protected Gson gson;

	public abstract void GetObjectMapper(ObjectMapper objectMapper);

	public abstract void GetObjectMapper(Gson gn);

}
