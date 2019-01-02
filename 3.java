
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	Ideone()
	{
		this(10,11);
		System.out.println("Default Constructor");
	}
	Ideone(int a,int b)
	{
		System.out.println("a : "+a+"\nb : "+b);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		new Ideone();
		
		
	}
}
