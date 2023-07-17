package com.ecom.qa.logical.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String str ="vivekanandkumar";
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(map.get(ch[i])==null)
			{
				map.put(ch[i], 1);
			}else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		System.out.println("The Remove Element from String will be:");
		for(Entry<Character, Integer> enter:map.entrySet())
		{
			System.out.print(enter.getKey()+" ");
		}
		
	}

}
