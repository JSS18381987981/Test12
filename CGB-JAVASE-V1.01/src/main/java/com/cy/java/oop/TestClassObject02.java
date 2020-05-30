package com.cy.java.oop;

public class TestClassObject02 {
	public static void main(String[] args) {
		ClassLoader c1 = ClassLoader.getSystemClassLoader();
		System.out.println(c1.getClass());
		ClassLoader c2 = c1.getParent();
		System.out.println(c2.getClass());
		
	}
}
