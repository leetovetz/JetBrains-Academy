package com.geekhub.hw2;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.sqrt;

public class ShapeTriangle implements ShapeInterface {
	int a, b, c;

	public ShapeTriangle(int sideA, int sideB, int sideC) {
		a = sideA;
		b = sideB;
		c = sideC;
	}

	public void action() {
		System.out.println("Area of triangle = " + calculateArea());
		System.out.println("Triangle perimeter = " + calculatePerimeter());
	}

	@Override
	public int calculateArea() {
		int hight;
		int p;
		p = (a + b + c) / 2;
		hight = (int) (2 * sqrt(p * (p - a) * (p - b) * (p - c)) / a);
		return a * hight / 2;
	}

	@Override
	public int calculatePerimeter() {
		return (a + b + c);
	}
}
