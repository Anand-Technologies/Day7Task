package org.cts.test.task;

import java.util.*;

public class Question10 {
	public static void main(String[] args) {
	//Question- 10.1
	List li = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
	List si = new ArrayList(Arrays.asList(30,40,50,60,80));
	System.out.println("");
	si.retainAll(li);
	System.out.println(si);
	
	//Question-10.2
	List mi = new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
	List<Integer> ni = new ArrayList<Integer>(Arrays.asList(10,20,60,50,40,70,80,90));
	ni.retainAll(mi);
	System.out.println(ni);
	
	//Question- 10.3
	List ti = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
	List vi = new ArrayList(Arrays.asList(100,200,300,400,500,600,700,8000));
	vi.retainAll(ti);
	System.out.println(vi);
	}

}
