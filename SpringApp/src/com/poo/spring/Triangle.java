package com.poo.spring;

public class Triangle {
private Point PointA;
private Point PointB;
private Point PointC;

public Point getPointA() {
	return this.PointA;
}

public void setPointA(Point pointA) {
	this.PointA = pointA;
}

public Point getPointB() {
	return this.PointB;
}

public void setPointB(Point pointB) {
	this.PointB = pointB;
}

public Point getPointC() {
	return this.PointC;
}

public void setPointC(Point pointC) {
	this.PointC = pointC;
}

public void draw() {
System.out.println("PointA=("+getPointA().getX()+","+getPointA().getY()+")");	
System.out.println("PointB=("+getPointB().getX()+","+getPointB().getY()+")");	
System.out.println("PointC=("+getPointC().getX()+","+getPointC().getY()+")");	
}
}
