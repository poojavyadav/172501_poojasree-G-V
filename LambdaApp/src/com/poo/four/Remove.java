package com.poo.four;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
	     lst.add("pooja");
	     lst.add("renu");
	     lst.add("vilasrao");
	     lst.add("sahiti");
	     lst.add("raja");
	     lst.removeIf(n->(n.length()%2!=0));
	     System.out.println("name with even length");
	     for (String name : lst) {
	    	 System.out.println(name);
			
		}
	}
}
                                                                                        