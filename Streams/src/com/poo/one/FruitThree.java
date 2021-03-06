package com.poo.one;


	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;
	import com.poo.streams.Fruit;

	public class FruitThree {

		public static void main(String[] args) {
			List<Fruit> list=new ArrayList<>();
			list.add(new Fruit("grape", 30, 60, "green"));
	        list.add(new Fruit("grape", 50, 90, "black"));
	        list.add(new Fruit("mango", 80, 150, "yellow"));
	        list.add(new Fruit("apple", 120, 160, "red"));
	        list.add(new Fruit("apple", 150, 250, "green"));
	       
			List<String> names=list.stream()
					.filter(p->p.getColor()=="red")
					.sorted(Comparator.comparing(Fruit::getPrice))
					.map(Fruit::getName)
					.collect(Collectors.toList());
			names.forEach(System.out::println);
			

		}
	}


