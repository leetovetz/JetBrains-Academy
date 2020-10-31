package com.geekhub.hw2;

public class ShapeRectangle extends ShapeSquare{
	String figure = "rectangle";
	
	public ShapeRectangle(int sideA, int sideB) {
		super(sideA);
		super.b = sideB;
	}
	
	public void action() {
        super.figure = figure;

        super.action();
    }
}
