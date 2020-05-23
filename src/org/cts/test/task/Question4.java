package org.cts.test.task;

import java.util.*;

public class Question4 {
	public static void main (String [] args) {
		//Question :4.1
		List<Integer> li = new ArrayList<>(Arrays.asList(10,20,30,90,10,10,40,50));
		int s = li.size();
		System.out.println("The Values in ArrayList is "+"\n"+ li);
		System.out.println("The Length of ArrayList is "+s);
		
		//Question :4.2
		List<Integer> si = new LinkedList<>(Arrays.asList(100,200,300,400,500,300));
		int t = si.size();
		System.out.println("The Values in LinkedList is "+si);
		System.out.println("The Length of LinkedList is "+t);
		
		//Question : 4.3
		List<Integer> hi = new Vector<Integer>(Arrays.asList(105,205,305,405,505,605,705));
		int v = hi.size();
		System.out.println("The Values in Vector is "+hi);
		System.out.println("The length of Vector is "+v);
	}
}
