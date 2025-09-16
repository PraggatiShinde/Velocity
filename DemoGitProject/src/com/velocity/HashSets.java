package com.velocity;

import java.util.HashSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(60);
		System.out.println(set);
		for (Integer i: set) {
			System.out.println(i);
		}
		
	}

}
