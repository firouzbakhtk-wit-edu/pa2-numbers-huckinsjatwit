package edu.wit.cs.comp1000;

/**
 * Solution to the second programming assignment.
 * Calculates Roots
 * 
 * @author Jack Huckins
 */
// Jack Huckins

import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a b c: ");
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
		
		double d;
		double r1;
		double r2;
		d=b*b-4*a*c;
		if (d<0) System.out.printf("Roots: imaginary%n");
		if (d==0) {
			r1=-b/2*a;
			System.out.printf("Root: %.2f%n",r1);
		}
		if (d>0) {
			r1=(-b+(Math.sqrt(d)))/(2*a);
			r2=(-b-(Math.sqrt(d)))/(2*a);
			if (r1<r2) System.out.printf("Roots: %.2f%.2f%n",r1,r2);
			else System.out.printf("Roots: %.2f, %.2f%n",r2,r1);
		}
		input.close();
	}

}
