package com.sample.beginner;

public class DefaultTest2 {
	
	public static void main(String[] args) {
		
		    System.out.println("Hello World");
		    
		    DefaultTest2 object = new DefaultTest2();
		    object.calc(10, 5);
		    
		    while(true)
		    {
		    	new DefaultTest2();
		    	System.out.println("heloo");
		    }
	}
	
	
	public void calc(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("The product of a and b is : "+c);
	}

}
