package com.geekhub.hw2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		int radius;
		int figureNumber;
						
			Scanner yourChoice = new Scanner(System.in);
			System.out.println("Select a figure and enter its number: "
					+ "\n1 - circle "
					+ "\n2 - square "
					+ "\n3 - rectangle "
					+ "\n4 - triangle");
			figureNumber = yourChoice.nextInt();
						
			switch (figureNumber) {
				case 1:
		            System.out.println("Please enter radius of Circle");
		            radius = yourChoice.nextInt();
		            ShapeCircle circle = new ShapeCircle(radius);
                    circle.action();
		            break;
				case 2:
		            System.out.println("Please enter side of square (a)");
		            a = yourChoice.nextInt();
		            ShapeSquare square = new ShapeSquare(a);
                    square.action();
		            break;
		            
				case 3:
		            System.out.println("Please enter sides of rectangle (a and b)");
		            a = yourChoice.nextInt();
                    b = yourChoice.nextInt();
                    ShapeRectangle rectangle = new ShapeRectangle(a,b);
                    rectangle.action();
		            break; 
		            
				case 4:
		            System.out.println("Please enter sides of triangle a, b and c");
		            a = yourChoice.nextInt();
                    b = yourChoice.nextInt();
                    c = yourChoice.nextInt();
                    ShapeTriangle triangle = new ShapeTriangle(a,b,c);
                    triangle.action();
		            break;  
		            
				default:
					System.out.println("There is no such figure. \nChoose numbers 1, 2, 3, 4.");
					break;
						
		} 
			yourChoice.close();
	}

}


/* You need to define Shape (as abstract class and as an interface), which at it's minimum has
2 methods defined: calculateArea() & calculatePerimeter()
You need to describe related Circle, Square, Rectangle, Triangle classes.
The program flow is:
User is invited to enter string representation of particular shape (use Enum to describe available types) e.g: Circle
After the figure type is specified user is invited to enter properties of the selected figure. e.g: for Circle: 
radius,  for Triangle: length of a, b & c sides etc.
Object of corresponding class needs to be created in memory.
Use object methods to fetch and display calculated area and perimeter values.
Note that Rectangle and Square shapes can be represented as 2 equivalent Triangle figures, 
hence when you display information about Rectangle and Square, also display properties of Triangles from which they comprise of.
 */
