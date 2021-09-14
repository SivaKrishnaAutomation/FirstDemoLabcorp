package com.test.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Anonymous {

	public static String readPropFile(String key) throws IOException  {
		
		File file = new File(System.getProperty("user.dir")+"//Data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value =  prop.getProperty(key);
		
		return value;
	}

	public static void main(String [] args) throws IOException {
		
		String user = readPropFile("password");
		//System.out.println(System.getProperty("user.dir"));

		It i = (username, password)->{
			
		if(username.equals(user)) {

			return "Success";
		}
		else {
			return "Fail";
		}

		};

		String ss = i.login("test", "test");
		System.out.println(ss);


	}

}

interface TestA{

	String m1(int a, int b);

	static void m2() {

	}

	default void m3() {

	}

}

interface It{

	String login(String username, String password);
}


