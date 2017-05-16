package com.capg;

public class TestOverride extends MainApp {

	public static void main(String[] args) {
		System.out.println("in TestOverride ");
		TestOverride.testStatic();
	}
	
	public static void testStatic()
	{
		System.out.println("TestOverride static method  with no param");
	}
	
	public static void testStatic(int i)
	{
		System.out.println("TestOverride static method  with one param");
	}
}
