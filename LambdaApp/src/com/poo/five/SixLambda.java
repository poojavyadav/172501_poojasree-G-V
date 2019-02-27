package com.poo.five;

import java.util.ArrayList;

public class SixLambda {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("pooja");
		list.add("acchu");
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
		

}
}
