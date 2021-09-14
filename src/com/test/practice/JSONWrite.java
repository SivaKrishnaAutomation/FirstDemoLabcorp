package com.test.practice;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

	public static void main(String[] args) throws IOException {
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("name", "java");
		jobj.put("age", 30);
		jobj.put("ID", 200);
		
		JSONArray ar = new JSONArray();
		ar.add("abc");
		ar.add("hgf");
		ar.add("aabc");
		
		jobj.put("details", ar);
		
		FileWriter fr = new FileWriter("JSONWrite.json");
		
		fr.write(jobj.toJSONString());
		
		fr.close();

	}

}
