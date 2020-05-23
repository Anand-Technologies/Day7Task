package org.cts.test.task;

import java.util.*;

public class Question11 {

	public static void main(String[] args) {
		List li = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
		List si = new ArrayList(Arrays.asList(30,40,50,60,80));
		si.removeAll(li);
		//li.removeAll(si);
		System.out.println(si);
		//System.out.println(li);
		
		List mi = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
		List ni = new ArrayList(Arrays.asList(10,20,60,50,40,70,80,90));
		ni.removeAll(mi);
		System.out.println(ni);
		
	}

}
