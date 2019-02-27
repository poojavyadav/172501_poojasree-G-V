package com.poo.five;


	import java.util.ArrayList;
	import java.util.List;
	public class Fivelambda {

		public static void main(String[] args) {
			
			List<String> array = new ArrayList<String>();
			array.add("pooja");
			array.add("achhu");
			array.add("sonu");
			array.add("sonchi");
			System.out.println("String is :\n"+array);
			System.out.println("The first words of the Strings are :");
		
			String result = array.stream().map(e -> Character.toString(e.charAt(0))).reduce(" ", (a, b) -> a + b);
			System.out.println(result);
		
		}
		}



