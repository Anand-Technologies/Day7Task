package org.cts.test.task;

import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		//To find index of given input - Question 5.1
		List li = new ArrayList(Arrays.asList(10,20,"Anand",30,'a',90));
		int s = li.indexOf(10);
		int t = li.indexOf("Anand");
		System.out.println("The index of 10 is "+s);
		System.out.println("The index of Anand is "+t);
		
		//Question- 5.2 & 5.3
		List si = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
		int u = si.lastIndexOf(10);
		System.out.println("The last index of 10 is "+u);
		int w = si.indexOf(50);
		System.out.println("the index value of 50 is "+w);
		
		Object x = si.indexOf(10);//index of value
		Object y = si.get(5);//value of index
		System.out.println("Each index of 10 is "+x +"\n"+ y);
		int z = si.indexOf(70);
		System.out.println("Index of 70 is "+z);
		
		//Get each index value of 10 present in below
		for(int i = 0; i<si.size(); i++) {
		   if(si==10);
		   
		}
		
		
		


	}

}
