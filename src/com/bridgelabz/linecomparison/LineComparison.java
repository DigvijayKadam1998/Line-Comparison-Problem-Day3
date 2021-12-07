package com.bridgelabz.linecomparison;

import java.util.Scanner;
public class LineComparison {
	public static void main(String[] args) {
	    // variables
	    int x1, x2, y1, y2;
	    double LENGTH_OF_LINE = 0;
		
	    // taking input by using scanner class
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter x1 Point");
	    x1 = sc.nextInt();
	    System.out.println("Enter y1 Point");
	    y1 = sc.nextInt();
	    System.out.println("Enter x2 Point");
	    x2 = sc.nextInt();
	    System.out.println("Enter y2 Point");
	    y2 = sc.nextInt();
		
	    // calculate length of line
	    LENGTH_OF_LINE = (Math.sqrt((x2-x1)^2+(y2-y1)^2));
	    System.out.println("Length of Line is: " + LENGTH_OF_LINE);
	}
}
