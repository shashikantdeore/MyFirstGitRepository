package com.capg;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("Test Gradle in Eclipse Succesful");
		String str =null;
		String str1 ="abc";
		str1 ="xyz"; 
		if(str1.equals(str))
		{
			System.out.println("-----");
		}
		System.out.println("-----"+str1);
		testStatic();
	}

	public static void testStatic()
	{
		System.out.println("testStatic with no param");
	}
	public static void testStatic(int i)
	{
		System.out.println("testStatic with one param");
	}
	public static void testStatic(int i,String s)
	{
		System.out.println("testStatic with two param");
	}
}
