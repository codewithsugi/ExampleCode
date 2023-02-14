package com.sample.beginner;

public class DefaultTest {
	
	public static void main(String[] args) {
		
		    System.out.println("Hello World");
		    
		    DefaultTest object = new DefaultTest();
		    object.calc(10, 5);
	}
	
	
	public void calc(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("The product of a and b is : "+c);
	}

}
