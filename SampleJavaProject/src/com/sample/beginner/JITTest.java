package com.sample.beginner;

public class JITTest {

	public static void main(String[] args) {
		
		JITTest obj = new JITTest();
		long initial = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			obj.display(2,3);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - initial);

	}

	private void display(int a, int b) {
		
		System.out.println(a+b);
		
	}

}
