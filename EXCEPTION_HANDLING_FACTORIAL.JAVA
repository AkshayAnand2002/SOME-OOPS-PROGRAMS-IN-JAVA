/*
 Factorial (Exception Handling): Write a program called Factorial.
 java that computes factorials and catches the result in an array 
 of type long for reuse. The long type of variable has its own 
 range. For example 20! Is as high as the range of long type. 
 So check the argument passes and “throw an exception”, if it 
 is too big or too small. If x is less than 0 throw an 
 IllegalArgumentException with a message “Value of x must 
 be positive”. If x is above the length of the array throw 
 an IllegalArgumentException with 
 a message “Result will overflow”. Here x is the value 
 for which we want to find the factorial.
 * */
package src;
import java.io.*;
import java.util.*;
public class practise10 {
    public static long factorial(int x) {
        long fact = 1l;
        for(int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        try {
            int x = sc.nextInt();
            if(x < 0) {
                throw new IllegalArgumentException("Value of x must be positive");
            } else if (factorial(x) > Long.MAX_VALUE) {
                throw new IllegalArgumentException("Result will overflow");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
