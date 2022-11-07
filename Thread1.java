import java.util.Scanner;

public class Thread1 extends Thread{
	public String threadname;
	public int counter;
	public Thread1(String threadname,int counter) {
		this.threadname=threadname;
		this.counter=counter;
	}
	//run method is overridden by us.
	public void run() {
		while(counter<1000) {
			counter++;
			if(threadname.equals("THREAD_A")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(threadname.equals("THREAD_B")) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(threadname.equals("THREAD_C")) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(threadname+" : "+counter);
		}
	}
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1("THREAD_A",0);
		Thread1 thread2 = new Thread1("THREAD_B",0);
		Thread1 thread3 = new Thread1("THREAD_C",0);
		Thread1 thread4 = new Thread1("THREAD_D",0);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.out.println(thread1.counter);
		System.out.println(thread2.counter);
		System.out.println(thread3.counter);
		System.out.println(thread4.counter);
//		Scanner sc= new Scanner(System.in);
//		int x=sc.nextInt();
	}
}
