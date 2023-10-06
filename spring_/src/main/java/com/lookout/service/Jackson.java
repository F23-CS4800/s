package com.lookout.service.jackson;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class Jackson {
	public static void main(String args[]){
		ObjectMapper map = new ObjectMapper();
		String json = "{\"crime\":\"petty theft\", \"date occurred\":10/03/22}";
		JsonNode root = map.readTree(json);

		JsonNode crime = root.path("crime");
		System.out.println("Crime: " + crime.textValue());
		JsonNode date = root.path("date occurred");
		System.out.println("Date Occurred: " + date.textValue());
	}
	public Size getSize(String json) {
		ObjectMapper map = new ObjectMapper();
		JsonNode root = map.readTree(json);
		List<JsonNode> list = root.findParents("crime");
		return(list.size());
	}

}
