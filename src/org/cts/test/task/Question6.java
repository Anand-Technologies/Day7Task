package org.cts.test.task;
import java.util.*;

public class Question6 {
	public static void main(String[] args) {
		//Question - 6.1
		List li = new ArrayList(Arrays.asList(10,20,30,40,50,60));
		Object k = li.get(2);
		System.out.println("The value present in 2nd index is "+k);
		
		//Question - 6.2
		List si = new ArrayList(Arrays.asList(100,200,300,400,500,600,700));
		Object m = si.get(4);
		System.out.println("The value present in 4th index is "+m);
		
		//Question-6.3
		try {
		Object n = si.get(7);
		System.out.println(n);  }
		catch(IndexOutOfBoundsException e) {
		System.out.println("The Value present in 7th index is Not Found");   }
		
		
		//Question- 6.4
		for(int i=0; i<si.size(); i++) {
			System.out.println("The values present in list by Normal For loop "+si.get(i));    }
		
		//Question-6.5
		for (Object x : si) {
			System.out.println("The values present in list by enhanced for loop "+ x);
		}
	}

}
