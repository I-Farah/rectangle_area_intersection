
package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;

/**
 * This class will find the intersection of two rectangles
 * 
 * @author Ibrahim Tonifarah
 *@version 8/24/2018
 *
 */

public class RectangleIntersection {
	/**
	 * Entry point into the application
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(70, 70, 60, 120);
		
		Rectangle rectangle2 = new Rectangle(80, 100, 130, 100);
		
		System.out.println(rectangle1);
		
		System.out.println(rectangle2);
		
		Rectangle rectangle3 = rectangle1.intersection(rectangle2);
		
		System.out.println(rectangle3);
		
		double width = rectangle3.getWidth();
		
		double height = rectangle3.getHeight();
		
		double area = width * height;
		
		System.out.println("Expected area: 4500.0");
		
		System.out.println("Calculated area: " + area);

	}

}
