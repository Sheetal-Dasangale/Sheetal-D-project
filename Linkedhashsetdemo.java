package com.set;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetdemo {
	public static void emptyset(LinkedHashSet<String> set) {
		if(set.isEmpty()) {
			System.out.println("Set is empty");
		}else {
			System.out.println("Set is not empty");
		}
	}


	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>(); 
		 set.add("Red");
		 set.add("Blue");
		 set.add("Green");
		 set.add("Purple");
		 set.add("Black");
		 Iterator<String> itr=set.iterator();
		  while(itr.hasNext()){
		  System.out.println(itr.next()); 
		  }
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Sheetal");
		al.add("Varsha");
		al.add("Shradha");
		al.add("Shravani");
		al.add("Shravani");
		LinkedHashSet<String> set1=new LinkedHashSet<String>(al);
		System.out.println(set1);
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
		HashSet<Integer> set2=new HashSet<Integer>(al1);
		System.out.println(set2);
		
		set1.clear();
		emptyset(set1);

	}

}
