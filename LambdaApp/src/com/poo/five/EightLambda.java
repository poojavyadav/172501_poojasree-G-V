package com.poo.five;


public class EightLambda {

	public static void main(String[] args) {
		
		 Runnable r= ()->
         {for(int i=0;i<10;i++) 
         {
       	  System.out.println("thread"+i);
         }
	
         };
 Thread t=new Thread(r); 
 t.start();
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	
System.out.println("interrupted exception in thread");
}
 
 for(int i=11;i<20;i++) 
 {
	  System.out.println("new thread"+i);
 }
}
	}

