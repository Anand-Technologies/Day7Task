package org.cts.test.task;

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		//Remove the value present at 2nd index - Question-7.1
		List li = new ArrayList(Arrays.asList(10,20,30,40,50,60));
		System.out.println("The values in list(Li) is Before remove"+li);
		li.remove(2);
		System.out.println("The values in list(Li) after removing 2nd index "+li);
		
		//Question - 7.2
		try {
		Object y = li.remove(10);
		System.out.println(y);  }
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out of Bound Exceeption "); }
		
		//Remove the last value of 10 
		List si = new ArrayList(Arrays.asList(10,20,30,40,10,10,50,60));
		System.out.println("Before removing the value in List(Si) "+si);
		si.remove(5);
		System.out.println("After removing the value of lastindex 10 in list(Si) "+si);		
	}
}
