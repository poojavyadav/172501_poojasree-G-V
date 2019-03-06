package com.poo.Assign;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Mobile implements InitializingBean,DisposableBean,ApplicationContextAware,BeanNameAware {
private String ModelName;
private String color;
private ApplicationContext context;
public Mobile(String modelName, String color) {
	super();
	ModelName = modelName;
	this.color = color;
}
public String getModelName() {
	return ModelName;
}
public void setModelName(String modelName) {
	ModelName = modelName;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public void display()
{
	 System.out.println("Model of the mobile is:"+getModelName());
	 System.out.println("color of the mobile is:"+getColor());
}



@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Hi customer");
	
}
public void myInit()
{
	System.out.println("MyInit() called...");
}
public void myCleanUp() {
	System.out.println("Cleaned...");
}@Override
public void destroy() throws Exception {
	 System.out.println("Destroyed Customer");
	
}
@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
	// TODO Auto-generated method stub
	this.context=context;
	
}
@Override
public void setBeanName(String BeanName) {
	System.out.println("my beanName is:"+BeanName);
	// TODO Auto-generated method stub
	
}
}
