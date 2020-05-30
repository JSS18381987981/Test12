package com.cy.java.oop;
class ClassA{
	static{
		System.out.println("ClassA.static{}");
	}
}
//-XX:+TraceClassLoading
public class TestClassObject01 {
	public static void main(String[] args) throws Exception {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		loader.loadClass("com.cy.java.oop.ClassA");
	}
}

