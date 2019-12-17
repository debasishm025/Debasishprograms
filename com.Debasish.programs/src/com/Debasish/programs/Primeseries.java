package com.Debasish.programs;
import java.util.Scanner;


public class Primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a 1st");
		int start=scn.nextInt();
		System.out.println("Enter last");
		int end=scn.nextInt();
		int flag=1;
		
		for(int  i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				System.out.println(i);
			}	
		}
		
	}

}
