package org.tnsif.acc.c2tc.ScannerMethod_Buffereading;

import java.util.*;

public class ScannerIndexDemo {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter  the strings");
	char ch = scan.next().charAt(3);
	System.out.println("the fourth character of string is - "+ch);
	scan.close();
	
	}
	

}