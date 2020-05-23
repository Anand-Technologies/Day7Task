package org.cts.test.task;

import java.util.*;

public class Question9 {

	public static void main(String[] args) {
		List li = new ArrayList(Arrays.asList(100,200,300,400,500,600,700));
		System.out.println("Before replace the value in list li "+li);
		li.set(2, 350);
		System.out.println("After replace the value in list li "+li);
		
		List si = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50,10));
		System.out.println("Before replace the value in list si "+si);
		si.set(7, 70);
		System.out.println("After replace the value in list si "+si);
		
		li.set(10, 100);
		System.out.println(li);
	}
}
		