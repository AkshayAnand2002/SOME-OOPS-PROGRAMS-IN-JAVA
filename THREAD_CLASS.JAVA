/*
 Thread Class (Thread): Write a Java Program to Check Whether 
 Define a Thread Class Without Defining run() Method in the Class.
 */
package src;
import java.io.*;
import java.util.*;
class HelloThread extends Thread {
    public void sayHello() {
        System.out.println("Hello!");
    }
}
public class practise16 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HelloThread T1 = new HelloThread();
        T1.start();
        T1.sayHello();
    }
}
