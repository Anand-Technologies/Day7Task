package org.cts.test.task;

//Question 1 & 2 To find Sum & Average
public class Question1 {
		public static void main(String[] args) {      
			int arr[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int sum = 0;
			int sum1 = 0;
			for (int i=0; i<=arr.length;i++) {
				sum = sum +i;
			}
			System.out.println("The sum is " + sum);
			double average = sum/10;
			System.out.println("The average value is "+average);
			
			for (int i : arr) {
			sum1 = sum1 + i;	
			}
			System.out.println("The Sum1 is "+sum1);
			
		}

	}


