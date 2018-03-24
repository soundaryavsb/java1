/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Parent
{
	void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent
{
	// This method overrides show() of Parent
	@Override
	void show() { System.out.println("Child's show()"); }
}

// Driver class
class Ideone
{
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}

