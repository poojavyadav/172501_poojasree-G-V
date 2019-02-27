package com.poo.one;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.poo.streams.Trader;
import com.poo.streams.Transaction;


public class Eight {

	public static void main(String[] args)
	{
		List<Transaction>list = new ArrayList<>();
		list.add(new Transaction(new Trader("lakshmi","karnataka"),2011,3800));
		list.add(new Transaction(new Trader("sonu","pune"),2011,3000));
		list.add(new Transaction(new Trader("acchu","Delhi"),2014,2500));
		list.add(new Transaction(new Trader("pooja","Pune"),2011,4000));
		list.add(new Transaction(new Trader("diya","Kolkata"),2013,1900));
		
		List<Trader> list2 =list.stream()
				.filter(t->t.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.map(Transaction::getTrader)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);	
	}
	}

