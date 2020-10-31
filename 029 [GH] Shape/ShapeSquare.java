package com.geekhub.hw2;

import static java.lang.StrictMath.sqrt;

public class ShapeSquare implements ShapeInterface {
	int a, b;
	String figure = "square";

	public ShapeSquare(int sideA) {
		a = sideA;
		b = a;
	}

	public void action() {
		System.out.println("Area of " + figure + " = " + (calculateArea()));
		calculateArea();
		System.out.println("Perimeter of " + figure + " = " + calculatePerimeter());
		calculatePerimeter();
		getTriangleProperties();
	}

	public void getTriangleProperties() {
		System.out.println("This " + figure + " consists of a two triangles with 2 cathetus: " + a + " and " + b
				+ " and hypotenuse: " + sqrt(a * a + b * b));
	}

	@Override
	public int calculateArea() {
		return a * b;
	}

	@Override
	public int calculatePerimeter() {
		return (a + b) * 2;
	}

}
