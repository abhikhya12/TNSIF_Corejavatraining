package org.tnsif.acc.c2tc.ScannerMethod_Buffereading;

import java.util.*;

public class ScannerMethodDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String var = sc.nextLine();
		
		
		System.out.println("enter the age");
		int var1 = sc.nextInt();
		
		System.out.println("name is " +var);
		System.out.println("age is " +var1);
		System.out.println("the letter of index 2 is "  +var.charAt(2));
		sc.close();
		
	}
}