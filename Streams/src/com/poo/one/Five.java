package com.poo.one;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

import com.poo.streams.News;

	public class Five {

		public static void main(String[] args) {
			
				List<News> list=new ArrayList<>();
				list.add(new News(1,"poo","The budget is very tight","Yeah True"));
				list.add(new News(2,"sonu","No budget for trip sorry","Thats ok"));
				list.add(new News(3,"acchu","KGF was having high budget"," yeah high budget in sandel hood"));
				list.add(new News(3,"dimple","budget for year ","The budget is 23LAKH CRORES"));
				list.add(new News(2,"sonchi","sports budget","for ipl India invests alot of budget "));
				list.add(new News(1,"ammu","budget for thiti movie","Thiti movie was having very less budget"));
			List<News> list1=list.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
			long l=list1.stream().count();
			System.out.println("The word budget in comments are "+l + " times");
		}

	}


