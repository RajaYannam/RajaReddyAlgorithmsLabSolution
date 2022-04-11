package com.mycomp.Transaction;

import java.util.Scanner;

public class Paymoney {
		 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size =sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetno=sc.nextInt();
		
		while(targetno!=0)
		{
			int flag=0;
			System.out.println("Enter the value of target");	
			int target=sc.nextInt();
			int sum=0;
			for(int i=0;i<size;i++)
			{
				sum+=a[i];
				if(sum>=target)
				{
					System.out.println("Target achieved after" + " "+ (i+1) +" " +"transactions");
					flag=1;
					break;
				}
				
			}
				if(flag==0)	
				System.out.println("Given target is not achieved");
				targetno--;
					
		  }
		
		sc.close();
	 }
	
	
}
