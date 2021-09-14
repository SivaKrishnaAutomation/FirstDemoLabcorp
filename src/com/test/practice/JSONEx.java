package com.test.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.seleniumhq.jetty9.http.HttpField.IntValueHttpField;

public class JSONEx {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsn = new JSONParser();
		
		FileReader fr = new FileReader("JsnFile.json");
		Object obj = jsn.parse(fr);
		
		JSONObject jobj =(JSONObject) obj;
		
		int name= Integer.valueOf((String)(jobj.get("firstname")));
		String comp= (String)jobj.get("company");
		
		System.out.println(name+"======"+comp);
		
		/*
		 * JSONArray jsArray = (JSONArray) jobj.get("books");
		 * 
		 * for(int i=0;i<jsArray.size();i++) {
		 * 
		 * JSONObject j = (JSONObject) jsArray.get(i);
		 * 
		 * String s = (String)j.get("edition"); System.out.println(s);
		 * 
		 * 
		 * }s
		 * 
		 */

	}

}
