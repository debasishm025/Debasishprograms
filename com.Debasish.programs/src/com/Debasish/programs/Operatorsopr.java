package com.Debasish.programs;

public class Operatorsopr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		System.out.println(a++ > 5 && ++b >6);//false
		System.out.println(a);//6  we have not storedanywhere the incremented value
		System.out.println(a);//6
		
		System.out.println(a+"+"+b+"="+(a+b));
	}

}
