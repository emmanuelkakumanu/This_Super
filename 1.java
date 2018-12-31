
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int a=4,b=7;
	void m1()
	{
		System.out.println("a : "+a );
		System.out.println("b : "+this.b);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		new Ideone().m1();
	}
}
