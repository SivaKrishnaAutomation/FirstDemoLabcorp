package com.test.training;

import java.util.StringTokenizer;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str = "tarining,Renee,Labcorp";
		String [] ast = str.split(",");
		System.out.println(ast[3]);
		
		StringTokenizer st = new StringTokenizer("Java,Training,is,123,conducted,at,456",",");
		
		int count = st.countTokens();
		System.out.println(st.countTokens());
		
		for(int i=0;i<count;i++) {
			
			//System.out.println("Token "+i+st.nextToken()+"");
			
		}
		
		while(st.hasMoreElements()) {
			
			Object s = st.nextElement();
			
		}
		
	}

}
