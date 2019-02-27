package com.poo.one;

import java.util.ArrayList;
import java.util.List;

import com.poo.streams.Trader;
import com.poo.streams.Transaction;

public class Stream15 {
	public static void main(String[] args)
	{
		List<Transaction>list = new ArrayList<>();
		list.add(new Transaction(new Trader("lakshmi","karnataka"),2011,3800));
		list.add(new Transaction(new Trader("sonu","pune"),2011,3000));
		list.add(new Transaction(new Trader("acchu","Delhi"),2014,2500));
		list.add(new Transaction(new Trader("pooja","Pune"),2011,4000));
		list.add(new Transaction(new Trader("diya","Kolkata"),2013,1900));
	Transaction max2=list.stream()
			.min((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
			.get();
	System.out.println(max2.getValue());
	}
}
