package com.Debasish.programs;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check a number is prime or not");
		int num=sc.nextInt();
		
		int flag=1;
		if(num==0)
		{
			System.out.println("Entered number is neither a prime or composite");
return;
		}
		if(num==1)
		{
			System.out.println("Entered number is  not prime");
return;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			flag=0;
			System.out.println("Entered number is  not prime");
			break;
			}
		}
		if(flag==1)
		{
			System.out.println("Entered number is prime"+flag);
		}
		
		
	}

}
