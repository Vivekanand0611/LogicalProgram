package com.ecom.qa.logical.string;

public class RemoveWhiteSpaceFromTheString {
	public static void main(String[] args) {
		
		String name ="My Name Is Vivek";
		char[] ch = name.toCharArray();
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=' ')
			{
				res = res+ch[i];
			}
		}
		System.out.println(res);
	}

}
