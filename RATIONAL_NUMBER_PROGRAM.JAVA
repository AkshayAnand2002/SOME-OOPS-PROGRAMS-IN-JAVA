/*
Define a package containing class for rational numbers. A rational number
is a number that can be represented as the quotient of two integers.
Represent rational numbers as two values of type int, one for the numerator
and one for the denominator. Your class should have two instance variables
of type int. call the class Rational. Include a constructor with two
arguments that can be used to set the instance variables of an object to any
values. Also include a constructor that has only a single parameter of type
int; call this single parameter wholeNumber and define the constructor so
that the object will be initialized to the rational number wholeNumber/1.
Also include a no-argument constructor that initializes an object to 0.
Note that the numerator, the denominator, or both may contain a minus
sign. Define methods for addition, subtraction, multiplication, and division
of objects of your class Rational. These methods should be static methods
that each have two parameters of type Rational and return a value of type
Rational. For example, Rational. Add (r1, r2) will return the result of
adding the two rational numbers (two objects of the class Rational, r1 and
r2). Define getters and setters as well as the methods equals and toString.
You should include a method to normalize the sign of the rational number
so that the denominator is positive and the numerator is either positive or
negative. For example, after normalization, 4/-8 would be represented the
same as -4/8.
Write a test program in a separate package that import the corresponding
package (containing rational class) and test the various operations of
rational class.
*/
package src;
import java.util.*;
import java.math.BigInteger;
class Rational{
	private int r[] = new int[2];
	Rational(int a,int b) {
		r[0]=a;
		r[1]=b;
	}
	Rational(int a){
		r[0]=a;
		r[1]=1;
	}
	Rational(){
		r[0]=0;
		r[1]=1;
	}
	public static Rational add(Rational a,Rational b) {
		a.r[0] = a.r[0]*b.r[1]+b.r[0]*a.r[1];
		a.r[1]=a.r[1]*b.r[1];
		if(a.r[1]<0 && a.r[0]>0) {
			a.r[0]=a.r[0]*-1;
			a.r[1]= Math.abs(a.r[1]);
		}
		return a;
	}
	public static Rational sub(Rational a,Rational b) {
		a.r[0] = a.r[0]*b.r[1]- (b.r[0]*a.r[1]);
		a.r[1]=a.r[1]*b.r[1];
		
		if(a.r[1]<0 && a.r[0]>0) {
			a.r[0]=a.r[0]*-1;
			a.r[1]= Math.abs(a.r[1]);
		}
		return a;
	}
	public static Rational mul(Rational a,Rational b) {
		a.r[0] = a.r[0]*b.r[0];
		a.r[1]=a.r[1]*b.r[1];
		if(a.r[1]<0 && a.r[0]>0) {
			a.r[0]=a.r[0]*-1;
			a.r[1]= Math.abs(a.r[1]);
		}
		return a;
	}
	public static Rational div(Rational a,Rational b) {
		a.r[0] = a.r[0]*b.r[1];
		a.r[1]=a.r[1]*b.r[0];
		if(a.r[1]<0 && a.r[0]>0) {
			a.r[0]=a.r[0]*-1;
			a.r[1]= Math.abs(a.r[1]);
		}
		return a;
	}
	public static void display(Rational r1) {
		System.out.println(r1.r[0]+"/"+r1.r[1]);
	}
}
public class Lab7_2 {
	
	public static void main(String [] args) {
		Rational[] r1 = new Rational[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			int a=0,b=0;
			System.out.println("Enter the numerator of "+(i+1) +"rational no.");
			a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the denominator of "+(i+1) +"rational no.");
			b = sc.nextInt();
			sc.nextLine();
			if(b==0) {
				 r1[i] = new Rational(a);
			}
			else if(a==0) {
				r1[i] = new Rational();
			}
			else {
				 r1[i] = new Rational(a,b);
			}
		}
		Rational.add(r1[0],r1[1]);
		Rational.display(r1[0]);
		Rational.sub(r1[0],r1[1]);
		Rational.display(r1[0]);
		Rational.mul(r1[0],r1[1]);
		Rational.display(r1[0]);
		Rational.div(r1[0],r1[1]);
		Rational.display(r1[0]);
	}
}
