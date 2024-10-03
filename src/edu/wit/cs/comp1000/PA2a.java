package edu.wit.cs.comp1000;

/**
 * Solution to the first programming assignment.
 * Does calculations on 5 numbers.
 * 
 * @author Jack Huckins
 */
// Jack Huckins

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter five whole numbers: ");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		int d= input.nextInt();
		int e= input.nextInt(); 
		
		double overall_avg= ((a+b+c+d+e)/5.0);
		int overall_sum= (a+b+c+d+e);
		
		int pos_sum=0;
		double pos_c=0;
		double pos_avg=0;
		if (a>0) {
			pos_sum=pos_sum+a;
			pos_c++;
		}
		if (b>0) {
			pos_sum=pos_sum+b;
			pos_c++;
		}
		if (c>0) {
			pos_sum=pos_sum+c;
			pos_c++;
		}
		if (d>0) {
			pos_sum=pos_sum+d;
			pos_c++;
		}
		if (e>0) {
			pos_sum=pos_sum+e;
			pos_c++;
		}
		if (pos_c>0) pos_avg=pos_sum/pos_c;
		
		
		int neg_sum=0;
		double neg_c=0;
		double neg_avg=0; 
		if (a<=0) {
			neg_sum=neg_sum+a;
			neg_c++;
		}
		if (b<=0) {
			neg_sum=neg_sum+b;
			neg_c++;
		}
		if (c<=0) {
			neg_sum=neg_sum+c;
			neg_c++;
		}
		if (d<=0) {
			neg_sum=neg_sum+d;
			neg_c++;
		}
		if (e<=0) {
			neg_sum=neg_sum+e;
			neg_c++;
		}
		if (neg_c>0) neg_avg=neg_sum/neg_c;
		
		
		if (pos_c==1) {
			System.out.printf("The sum of the %.0f positive number: %d%n",pos_c,pos_sum);
		} else {
			System.out.printf("The sum of the %.0f positive numbers: %d%n",pos_c,pos_sum);
		}
		
		
		if (neg_c==1) {
			System.out.printf("The sum of the %.0f non-positive number: %d%n",neg_c,neg_sum);
		} else {
			System.out.printf("The sum of the %.0f non-positive numbers: %d%n",neg_c,neg_sum);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n",overall_sum);
		if (pos_c==1) {
			System.out.printf("The average of the %.0f positive number: %.2f%n",pos_c,pos_avg);
		} else {
			System.out.printf("The average of the %.0f positive numbers: %.2f%n",pos_c,pos_avg);
			
		}
		if (neg_c==1) {
			System.out.printf("The average of the %.0f non-positive number: %.2f%n",neg_c,neg_avg);
		} else {
			System.out.printf("The average of the %.0f non-positive numbers: %.2f%n",neg_c,neg_avg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n",overall_avg);
		
		input.close();
	}

}
