package org.data;


public class TestSample extends Sample {

	@Override
	public void method2() {

int a=10, b=20;
int c=a+b;
int d=a/b;
System.out.println(d);
System.out.println(c);
super.method2();
System.out.println("String");
	}
	
	public static void main(String args[])
	{
		
		
		TestSample t = new TestSample();
		t.method2('1', 20);
		
	
	}


}
