package com.geekhub.hw2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ShapeCircle implements ShapeInterface {

	private int radius;

	public ShapeCircle(int circleRadius) {
		radius = circleRadius;
	}

	public void action() {
		System.out.println("Area of circle = " + calculateArea());
		System.out.println("Perimetr of circle = " + calculatePerimeter());
	}

	@Override
	public int calculateArea() {
		return (int) (PI * pow(radius, 2));
	}

	@Override
	public int calculatePerimeter() {
		return (int) (2 * PI * radius);
	}

}
