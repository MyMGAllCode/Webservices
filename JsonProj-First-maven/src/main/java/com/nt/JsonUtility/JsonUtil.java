package com.nt.JsonUtility;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper=null;
	static{
		mapper=new ObjectMapper();
		
	}
	
	
	public static  String javaToJson(Object obj) throws JsonProcessingException
	{
		String json =mapper.writeValueAsString(obj);
		return json;
	}

	public static Object jsonToJava(String json) throws JsonParseException, JsonMappingException, IOException{
		Object obj=mapper.readValue(json, Object.class);
		return obj;
	}
}
