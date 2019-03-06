package com.poo.assign2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test2 {

	public static void main(String[] args) {
	
			ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		 List c=(List)context.getBean("list");
			c.show();
	}

}
