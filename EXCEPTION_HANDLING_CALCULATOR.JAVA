/*
 Calculator (Exception Handling): Create a class MyCalculator 
 which consists of a single method long power(int, int). This 
 method takes two integers, n and p, as parameters and 
 finds n^p. If either n or p is negative, then the method must 
 throw an exception which says "n or p should not be negative". 
 Also, if both n and p are zero, then the method must throw an 
 exception which says "n and p should not be zero". For example,
  -4 and -5 would result in java.lang.Exception: n or p should 
  not be negative. Complete the function power in class 
  MyCalculator and return the appropriate result after the 
  power operation or an appropriate exception as detailed above.
 * */
package src;
import java.io.*;
import java.util.*;
import java.lang.Math; 
class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } 
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) Math.pow(n, p);
    }
}
public class practise9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n, p;
        for(int i=0; i<5; i++) {
            n = s.nextInt();
            p = s.nextInt();
            MyCalculator calc = new MyCalculator();
            try {
                System.out.println(calc.power(n, p));
            } catch(Exception e) {
                System.out.println(e);
            }
        }
	}

}
