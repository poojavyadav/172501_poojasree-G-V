package com.poo.five;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SevenLambda {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("pooh","tumkur");
		map.put("acchu","shivmoga");
		map.put("sonu","chitradurga");
		map.put("sonchi","davangere");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
		

	}

}
