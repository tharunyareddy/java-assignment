package com.training.assignment1;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println("Enter length of array");
		
		Scanner sc=new Scanner(System.in);
		
		int arrlength=sc.nextInt();
		
		System.out.println("Populating");
		
		int a[]=new int[arrlength];
		for(int i=0;i<arrlength;i++)
		{
			a[i]=sc.nextInt();

		}
		
		System.out.println("Array");
		for(int i=0;i<arrlength;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		
		System.out.println("\nNew array");
		
		for(int i=0;i<arrlength;i++)
		{
			System.out.print(Math.sqrt(a[i])+"\t");
		}
		sc.close();

	}

}
