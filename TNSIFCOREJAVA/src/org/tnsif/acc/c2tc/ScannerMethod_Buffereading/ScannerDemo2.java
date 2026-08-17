package org.tnsif.acc.c2tc.ScannerMethod_Buffereading;

import java.util.*;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		System.out.println("enter your height");
		float height = sc.nextFloat();
		
		System.out.println("Are u a Student");
		boolean isStudent = sc.nextBoolean();
		
		System.out.println("enter your adhar number");
		long adhar =  sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter your favorite teacher");
		String teacher = sc.nextLine();
		
		System.out.println("enter your hobby");
		String hobby = sc.nextLine();
		
		System.out.println("enter your daily reading time");
		byte readingTime = sc.nextByte();
		sc.nextLine();
		
		System.out.println("Enter your CGPA");
        double cgpa=sc.nextDouble();
        sc.nextLine();
        
        
        System.out.println("Enter your siblings");
        short noofsib=sc.nextShort();
        sc.nextLine();
        
        System.out.println(" Student information");
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Height "+height);
		System.out.println("isstudent "+isStudent);
		System.out.println("aadhar "+adhar);
		System.out.println("Favorite Teacher"+teacher);
		System.out.println("Hobby "+hobby);
		System.out.println("Reading time"+readingTime);
		System.out.println("cgpa "+cgpa);
		System.out.println("Siblings "+noofsib);
		
		sc.close();

	}
	
	

}