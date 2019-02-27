package com.poo.one;


	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;
	import com.poo.streams.Fruit;

	public class FruitTwo {

		public static void main(String[] args) {
			List<Fruit> list=new ArrayList<>();
			list.add(new Fruit("grape", 30, 60, "green"));
	        list.add(new Fruit("arabic grape", 50, 90, "black"));
	        list.add(new Fruit("mango", 80, 150, "yellow"));
	        list.add(new Fruit("apple", 120, 160, "red"));
	        list.add(new Fruit("green apple", 150, 250, "green"));
	       
			List<Fruit> names3=list.stream()
					.sorted(Comparator.comparing(Fruit::getColor))
					.collect(Collectors.toList());
			names3.forEach(e->System.out.println("Fruit is  "+e.getName()+" having "+e.getColor() +" color"));
			
}
}