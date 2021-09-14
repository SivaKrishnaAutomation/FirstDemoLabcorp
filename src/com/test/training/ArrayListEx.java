package com.test.training;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayListEx {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("100");
		set.add("java");
		set.add("java");
		set.add("labcorp");
		set.add("Renee");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			
			String s = itr.next();
			System.out.println(s);
		}

	}

}
