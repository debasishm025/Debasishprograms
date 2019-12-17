package com.Debasish.programs;
import java.util.Scanner;
public class perfectCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number to check wheather that is perfect or not");
		int x=scn.nextInt();
		
		
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				p=p+i;
			
			}
			
			
		}
		if(p==x)
		{
			System.out.println("Entered number is perfect");
		}
		else
			System.out.println("Entered number is not perfect");

	}

}
