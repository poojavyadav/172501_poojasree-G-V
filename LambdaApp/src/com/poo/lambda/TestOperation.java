package com.poo.lambda;

public class TestOperation {

	public static void main(String[] args) {
     Operations addition=(a,b) ->(a+b);
     System.out.println("Addition value is "+addition.operation(5, 6));
     Operations substraction =(a,b) ->(a-b);
     System.out.println("substracted value is  "+substraction.operation(51, 6));
     Operations multiplication = (a,b) ->(a*b);
     System.out.println("multiplied value is  "+multiplication.operation(8, 3));
     Operations division = (a,b) ->(a/b);
     System.out.println("division value is  "+division.operation(4, 2));
     
	}

}
