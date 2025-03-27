package com.prac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "sanat");
		map.put(2,"aman");
		map.put(3, "rajiv");
		map.put(4,"shishir");
		
		//First way
		map.forEach((key,val)-> {
			System.out.print("Key is -> "+key);
			System.out.println(" Value is -> "+val);
		});
		
		System.out.println("Second way ************************");
		
		//Second Way 
		map.entrySet()
			.forEach((entry)->{
				System.out.print("Key is --> "+entry.getKey());
				System.out.println(" Value is --> "+entry.getValue());
			});
		
		map.entrySet()
		.forEach(entry->
			System.out.print("\nKey is --> "+entry.getKey()+" Value is --> "+entry.getValue()));
		
		System.out.println("\nThird way ************************");
		
		//Third Way
		Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer,String>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> entry = itr.next();
			
			System.out.println("Key is --> "+entry.getKey());
			System.out.println("Value is --> "+entry.getValue());
		}
		
		
		System.out.println("\nFourth way ************************");
		
		//Fourth Way
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println("Key is --> "+entry.getKey());
			System.out.println("Value is --> "+entry.getValue());
		}
		
		System.out.println("\nFifth way ************************");
		
		//Fifth Way
		for(Integer key : map.keySet())
		{
			System.out.println("Key is --> "+key);
			System.out.println("Value is --> "+map.get(key));
		}
		
		
		System.out.println("\nSixth way ************************");
		
		//Sixth Way
		
		map.keySet()
			.forEach(key-> System.out.println("Key is --> "+key+ " Value is --> "+map.get(key)));
		
		map.entrySet()
			.stream()
			.forEach(entry->
			System.out.print("\nKey is --> "+entry.getKey()+" Value is --> "+entry.getValue()));
		
		

	}

}
