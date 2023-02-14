package com.sample;

public class DefaultTestOne {

	public static void main(String[] args) {

		System.out.println("Hello World");

		DefaultTestOne object = new DefaultTestOne();
		object.calc(10, 5);
	}

	public void calc1(int a, int b) {
		int c;
		c = a * b;
		System.out.println("The new new product of a and b from Default One: " + c);
	}

	public void calc(int a, int b) {
		int c;
		c = a * b;
		System.out.println("The new product of a and b from Default One: " + c);
	}

	public void calc2(int a, int b) {
		int c;
		c = a * b;
		System.out.println("The new product of a and b from Default One: " + c);
		System.out.println("The new product of a and b from Default One: " + c);

		System.out.println("The new product of a and b from Default One: " + c);

		c = a * b;

		c = a * b;
	}

}
