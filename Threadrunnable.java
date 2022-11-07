import java.util.Scanner;
public class Threadrunnable implements Runnable{
	public String threadname;
	public int counter;
	private int waittimewhileloop;
	public Threadrunnable(String threadname,int counter,int waittimewhileloop) {
		this.threadname=threadname;
		this.counter=counter;
		this.waittimewhileloop=waittimewhileloop;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(counter<1000) {
			counter++;
			try {
				Thread.sleep(waittimewhileloop);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadname+" : "+counter);
		}
	}
	public static void main(String[] args) {
		Threadrunnable runnable1 = new Threadrunnable("THREAD_A",0, 500);
		Threadrunnable runnable2 = new Threadrunnable("THREAD_B",0, 1000);
		Threadrunnable runnable3 = new Threadrunnable("THREAD_C",0, 2000);
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(runnable3);
		thread1.start();
		thread2.start();
		thread3.start();
//		Scanner sc= new Scanner(System.in);
//		int x=sc.nextInt();
	}
}

