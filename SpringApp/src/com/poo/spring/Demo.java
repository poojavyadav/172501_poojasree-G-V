package com.poo.spring;

import org.springframework.context.ApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
//Triangle triangle = new Triangle();
//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	ApplicationContext con = new ClassPathXmlApplicationContext("Spring.xml");
	
Triangle triangle= (Triangle)con.getBean("triangle");
triangle.draw();

}
}
