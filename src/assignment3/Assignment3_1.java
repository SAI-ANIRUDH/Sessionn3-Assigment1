package assignment3;// package declaration compulsory.
/*
 * This assignment will help to master the scope of a variable.
 */

import assignment3.alpha.zeta; // Importing zeta class from assignment3 package.

public class Assignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

alpha al =new alpha(); // Creating instance for a class alpha
zeta z=new zeta(); // Creating instance for a class zeta


al.show(6);  //Calling 
z.show(7);

}

}
class alpha{
public	static int a = 30; // Declaring and Initializing Instance variable a as public and this can be visible in any subclass.
private int b = 40; // Declaring and Initializing Instance variable b as private and this can be visible only this class.
alpha(){
	int d = b - a; // subtracting of a non static variable from a static variable. 
	System.out.println("Result is"+d);
}
public static void show(int j) // creating the static method with parameter. 
{
	int k= a*j; // multiplication of two variables.
	System.out.println("Result is "+k);
}
 public static final class zeta extends alpha // creating a static class zeta 
 {
	private  double f = 7.5; // Declaring and initializing the variable f.
	public  void showzeta(int j)  // Calling the void method with parameter.
	{
	 double h=j * a * j * f; // Multiplication of numbers and storing it into the double variable.
	System.out.println("Result is"+h);	 
	}
	
}

}