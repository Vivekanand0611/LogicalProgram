package com.ecom.qa.logical.string;

import java.util.Scanner;

public class ReverseStringAndCheckPalindrome {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Input String:");
		String input = scan.next();
		char[] ch = input.toCharArray();
		String rev ="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev+ch[i];
		}
		if(rev.equalsIgnoreCase(input))
		{
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	}

}
