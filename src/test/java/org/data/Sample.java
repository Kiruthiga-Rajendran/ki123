package org.data;

public class Sample {

	private void method1()
	{
		System.out.println("Method 1");
	}
	
	public void method2()
	{
		System.out.println("Method 2");
	}
	
	public void method2(int a, char b)
	{
	
		
	}
	public void method2(char a, int b)
	{
		if(a==b)
		{
			System.out.println("Not correct");
		}
		else
		{
			System.out.println("Correct");
		}
	}
	
	
	public static void main(String args[])
	{
		Sample s = new Sample();
		
		s.method1();
		s.method2();
	
	}
}
