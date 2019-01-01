
package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;
/**
 * This class will create a Rectangle object and calculate its perimeter
 * @author Ibrahim Tonifarah
 * @version 8/24/2018
 *
 */

public class PerimeterCalculator {

	/**
	 * Entry point into the application
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		Rectangle rectangle2 = new Rectangle(60, 110, 50, 70);
		
		double width = rectangle2.getWidth();
		
		double height = rectangle2.getHeight();
		
		double perimeter = (2 * width) + (2 * height);
		
		System.out.println("Expected perimeter: 240.0");
		
		System.out.println("Calculated perimeter: " + perimeter);

	}

}
