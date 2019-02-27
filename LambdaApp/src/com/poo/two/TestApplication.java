package com.poo.two;

public class TestApplication {
public static void main(String[] args) {
	Application app=(price,status)->{
		if(price>10000)
		{
			System.out.println(status);
			}return price;
	};
	System.out.println(app.order(146789, "accepted"));
	System.out.println(app.order(1000, "completed"));
}
}
