/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a=10,b=20;
		String x="10",y="20";
		String str="Soundarya is a programmer ";
		String str1="and she works in zoho";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("is"));//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		System.out.println(str+" "+str1);
		System.out.println(str.concat(str1));
		System.out.println(a+b);//If you add two numbers, the result will be a number:
		System.out.println(x+y);//If you add two strings, the result will be a string concatenation:
		System.out.println(x+b);//If you add a number and a string, the result will be a string concatenation:
	}
}

