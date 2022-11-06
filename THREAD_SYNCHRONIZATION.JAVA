/*
 Synchronize the Threads (Thread): Write a Java Program to 
 Synchronize the Threads Acting on the Same Object. The 
 Synchronized Block in the Program can be Executed by 
 Only One Thread at a Time.
 * */
package src;
import java.io.*;
import java.util.*;
class Counter {
    public void print() {
        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}
class CounterThread extends Thread {
    Counter C;
    CounterThread(Counter C) {
        this.C = C;
    }
    public void run() {
        synchronized(C) {
            C.print();
        }
    }
}
public class practise14 {
    public static void main(String[] args) {
        Counter C = new Counter();
        CounterThread T1 = new CounterThread(C);
        CounterThread T2 = new CounterThread(C);  
        T1.start();
        T2.start();
    }
}
