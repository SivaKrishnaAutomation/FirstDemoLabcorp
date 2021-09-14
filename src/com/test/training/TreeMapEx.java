package com.test.training;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap();
		map.put(100, "Labcorp");
		map.put(101, "Renee");
		map.put(102, "siva");
		
		System.out.println(map.get(100));
		
		System.out.println(map);

	}

}

