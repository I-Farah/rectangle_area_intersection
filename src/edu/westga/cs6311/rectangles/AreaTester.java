package edu.westga.cs6311.rectangles;

import java.awt.Rectangle;
/**
 * This class will create a Rectangle object and calculate
 * its area
 * 
 * @author Ibrahim Tonifarah
 * @version 8/23/2018
 *
 */

public class AreaTester {
	/**
	 * Entry point into the application
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(50, 100, 40, 60);
		
		double width = rectangle1.getWidth();
		
		double height = rectangle1.getHeight();
		
		double area = width * height;
		
		System.out.println("Expected area: 2400.0");
		
		System.out.println("Calculated area: " + area);
	}
}
