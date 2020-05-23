package org.cts.test.task;

import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		//Question-8.1
		List li = new ArrayList(Arrays.asList(10,20,30,40,50,60));
		//Add a value 50 in 2nd index
		System.out.println("Before adding value in list "+li);
		li.add(2,50);
		System.out.println("After adding value in 2nd index "+li);
		
		//Questipn-8.2
		li.add(7, 70);
		System.out.println("After adding the value in last index "+li);
		
		//Question-8.3
		li.add(10,100);
		System.out.println(li);
		
	}
}
