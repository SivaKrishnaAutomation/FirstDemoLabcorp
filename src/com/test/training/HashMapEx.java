package com.test.training;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10,"abc");
		map.put(11,"labcorp");
		map.put(12,"labcorp");
		map.put(13,"labcorp");
		
		Set<Entry<Integer,String>> s = map.entrySet();
		
		/*
		 * for(Entry<Integer,String> e:s) {
		 * 
		 * System.out.println(e.getKey()+"...."+ e.getValue());
		 * 
		 * }
		 */
		
		Set<Entry<Integer,String>> ss = map.entrySet();
		Iterator<Entry<Integer,String>> i = ss.iterator();
		
		while(i.hasNext()) {
			
			Entry<Integer,String> e = i.next();
			System.out.println(e.getKey()+"----"+e.getValue());
		}
		
		

	}

}
