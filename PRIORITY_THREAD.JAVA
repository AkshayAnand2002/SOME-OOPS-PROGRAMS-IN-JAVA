/*
 Priority Thread (Thread): Create 4 threads with priority 1,3,5,7 
 respectively. Update a counter in each of the threads for 
 10 ms. Print the final value of count for each thread.
 * */
package src;
import java.io.*;
import java.util.*;
class CounterThread1 extends Thread {
    public void run() {
        long start = System.currentTimeMillis(), counter = 0;
        while (System.currentTimeMillis() - start <= 10) {
            counter++;
        }
        System.out.println("Thread with Priority " + getPriority() + ": " + counter);
    }
}
public class practise15 {
    public static void main(String[] args) {
        CounterThread1 T1 = new CounterThread1();
        CounterThread1 T2 = new CounterThread1();
        CounterThread1 T3 = new CounterThread1();
        CounterThread1 T4 = new CounterThread1();
        T1.setPriority(1);
        T2.setPriority(3);
        T3.setPriority(5);
        T4.setPriority(7);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}
