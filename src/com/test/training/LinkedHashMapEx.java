package com.test.training;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Emp,Stu> map = new LinkedHashMap<Emp,Stu>();
		
		map.put(new Emp("Siva", 100),new Stu(111,"SSS"));
		map.put(new Emp("krishna", 101),new Stu(222,"AAA"));
		
		Set<Entry<Emp,Stu>> set = map.entrySet();
		
		Iterator<Entry<Emp,Stu>> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry<Emp,Stu> e = itr.next();
			Emp eee = e.getKey();
			System.out.println(e.getKey().eid+"---"+e.getValue().sName);
		}
		

	}

}

class Emp{
	
	String ename;
	int eid;
	
	public Emp(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
}

class Stu{
	
	int rollNum;
	String sName;
	
	public Stu(int rollNum, String sName) {
		super();
		this.rollNum = rollNum;
		this.sName = sName;
	}
}