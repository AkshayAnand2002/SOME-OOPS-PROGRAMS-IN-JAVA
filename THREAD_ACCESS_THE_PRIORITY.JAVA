/*
 Access the Priority (Thread): Write a Java Program to Access
 the Priority You Can Use Method With Thread Object.
 * */
package src;
import java.io.*;
import java.util.*;
public class practise13 extends Thread {
    public void run() {
        System.out.println("Running");
    }
    public static void main(String[] args) {
    	practise13 s = new practise13();
        System.out.println("Thread priority: " + s.getPriority());
    }
}
