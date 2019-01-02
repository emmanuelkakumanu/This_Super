
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	A()
	{
		this(10,11);System.out.println("Defalut Constructor");
	}
	A(int a,int b)
	{
		System.out.println("Argumented constructor");
		System.out.println("a : "+a+"\nb : "+b);
	}
}
class B extends A
{
	B()
	{
		super();
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		new B();
	}
}
