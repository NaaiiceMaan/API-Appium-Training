package com.capgemini.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Twelveth {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(1,"anurag");
		hmap.put(2,"abbhishek");
		hmap.put(3,"akash");
		Set<Map.Entry<Integer,String>> hmapset = hmap.entrySet();
		ArrayList<Map.Entry<Integer,String>> hmaplist = new ArrayList<Entry<Integer,String>>(hmapset);
		System.out.println(hmaplist);
	}

}
