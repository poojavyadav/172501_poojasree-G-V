package com.poo.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.poo.streams.Trader;

public class Twelve {

	public static void main(String[] args) {
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("pooja", "Banglore"));
		list.add(new Trader("sonu","Hyderabad"));
		list.add(new Trader("acchu", "Indore"));
		list.add(new Trader("sonchi", "Pune"));
		list.add(new Trader("dimple", "Indore"));
		list.add(new Trader("renu", "Bangalore"));
		list.add(new Trader("sahiti", "Pune"));
		list.add(new Trader("kavya", "Indore"));
		list.add(new Trader("raja", "Pune"));
		list.add(new Trader("shreyas", "Indore"));
		System.out.println("Traders  in Indore are :");
		List<String> names2=list.stream()
				.filter(p->p.getCity()=="Indore")
				.map(Trader::getName)
				.collect(Collectors.toList());
		names2.forEach(System.out::println);
	}
}
