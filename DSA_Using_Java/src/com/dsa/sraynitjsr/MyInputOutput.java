package com.dsa.sraynitjsr;

import java.io.*;

public class MyInputOutput {
	
	public static void run() throws Exception {
		System.out.println("Inside Input Output Class");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an integer");
		int myInt = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a float number");
		float myFloat = Float.parseFloat(br.readLine());
		
		System.out.println("Enter a string");
		String myStr = br.readLine();
		
		System.out.println("Entered int is " + myInt);
		System.out.println("Entered float is " + myFloat);
		System.out.println("Entered string is " + myStr);
	}
}
