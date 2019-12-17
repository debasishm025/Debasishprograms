package com.Debasish.programs;

import java.util.Scanner;

public class Perfectnumberseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a number from which you want to print");
		int start=scn.nextInt();
		
		
		System.out.println("Enter a number upto which you want to print");
		int end=scn.nextInt();
		
		
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(i==sum)
				System.out.println("perfect nos are:\n"+i);
		}
}
}