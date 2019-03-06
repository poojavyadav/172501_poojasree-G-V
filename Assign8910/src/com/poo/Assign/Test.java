package com.poo.Assign;
	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class Test{
		public static void main(String[] args) {
				AbstractApplicationContext context=new ClassPathXmlApplicationContext("Assign.xml");
				context.registerShutdownHook();
			 Mobile mobile=(Mobile)context.getBean("mobile");
				mobile.display();
		}

	}


