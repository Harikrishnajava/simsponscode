package com.app.simpsons.challenge.abstract_class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.app.simpsons.Application;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public abstract class Utility {
	protected ObjectMapper objMapper;
	protected Gson gson;

	public abstract void GetObjectMapper(ObjectMapper objectMapper);

	public abstract void GetObjectMapper(Gson gn);

}
