package com.Debasish.programs;

public class A {
	static int i;
	
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		A a1=new A();
		a1.j=10;
		a1.i=7;
		
		
		
		
		A a2=new A();
		a2.j=20;
		a2.i=8;
		
		A a3=new A();
		a3.j=30;
		
		System.out.println(a1.j);
		System.out.println(a2.j);
		System.out.println(a3.j);
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(i);
		System.out.println(A.i);
		/*System.out.println(j);//non static variable cannot be refered directly ,we can do by object name.varname*/
	}
	

}
