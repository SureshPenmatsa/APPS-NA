package com.cg.oops;

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("the shape of the object is line");
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("the shape of the object is rectangle");
	}
	
}
class Cube extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("the shape of the object is cube");
	}
	
}
public class AbstractMethods {

	public static void main(String[] args) {
		
		Shape s1=new Line();
		s1.draw();
		Shape s2=new Rectangle();
		s2.draw();
		Shape s3=new Cube();
		s3.draw();
	}

}
