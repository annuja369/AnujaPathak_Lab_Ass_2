package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String args[]) throws Exception{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of transation arry");
		
		int  size = s.nextInt();
		int arr[] = new int [size];
		
		System.out.println("Enter the total no of targets that needs to be achived");
		
		int targetNo = s.nextInt();
		
		while(targetNo-- != 0) {
			
			int flag = 0;
			long target;
			
			System.out.println("Enter the value for target");
			
			target = s.nextInt();
			long sum = 0;
			
			for (int i = 0; i < size; i++) {
				
				sum = sum + arr[i];
				
				if(sum >= target) {
					
					System.out.println("Target is achived after" + (i+1) + "transaction");
					
					flag = 1;
					break;
					
				}
			}
			
			if (flag == 0) {
				
				System.out.println("Target is not achived");
			}
		}
	
		
	}

}
