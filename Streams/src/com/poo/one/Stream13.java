package com.poo.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.poo.streams.Trader;
import com.poo.streams.Transaction;

public class Stream13 {
	public static void main(String[] args)
	{
		List<Transaction>list = new ArrayList<>();
		list.add(new Transaction(new Trader("lakshmi","karnataka"),2011,3800));
		list.add(new Transaction(new Trader("sonu","pune"),2011,3000));
		list.add(new Transaction(new Trader("acchu","Delhi"),2014,2500));
		list.add(new Transaction(new Trader("pooja","Pune"),2011,4000));
		list.add(new Transaction(new Trader("diya","Kolkata"),2013,1900));
		List<Transaction> trans2=list.stream()
				.filter(p->p.getTrader().getCity()=="Delhi")
				.collect(Collectors.toList());
		trans2.forEach(e->System.out.println("Transaction value is: "+e.getValue()+" done by "+e.getTrader().getName()));
		

	}
	
}
