
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	void m1()
	{
		this.m2();
		System.out.println("m1 mehod in class A");
	}
	void m2()
	{
	
		System.out.println("m2 method in class A");
	}
}

class B extends A
{
	void m3()
	{
		super.m1();
		System.out.println("m3 method in class B");
	}
	void m4()
	{
		this.m3();
		System.out.println("m4 method in class B");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		B obj=new B();
		obj.m4();

	}
}
