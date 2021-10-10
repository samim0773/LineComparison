package com.bridgelabz;
import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		
		// print welcome message
		System.out.println("Welcome to Line Comparison Computation Program ");
		
		// take input from keyword
		Scanner sc = new Scanner(System.in);
		
		// take input from user for line 1 x-axis starting value
		System.out.print("Enter the value of starting point according to x-axis  of frist line: ");
		double x1 = sc.nextDouble();
		
		// take input from user for line 1 y-axis starting value
		System.out.print("Enter the value of starting point according to y-axis  of frist line: ");
		double y1 = sc.nextDouble();
		
		// take input from user for line 1 x-axis end value
		System.out.print("Enter the value of end point according to x-axis  of frist line: ");
		double x2 = sc.nextDouble();
		
		// take input from user for line 1 y-axis end value
		System.out.print("Enter the value of end point according to x-axis  of frist line: ");
		double y2 = sc.nextDouble();
		
		// calculate length of first line
		double length_of_line = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
		
		// print first line length
		System.out.println(length_of_line);
		
	}

}
