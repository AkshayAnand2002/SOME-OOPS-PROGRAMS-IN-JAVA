import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {
//	private int poolSize;
//	private ExecutorService executorService;
//	public ThreadManager(int poolSize) {
//		this.poolSize=poolSize;
//		executorService=Executors.newFixedThreadPool(poolSize);
//	}
//	public void execute(Runnable runnable) {
//		executorService.submit(runnable);
//	}
	public static void main(String[] args) {
		TaskManager taskmanager = new TaskManager(100);
		//ThreadManager threadManager=new ThreadManager(100);
		//ExecutorService executorService=Executors.newFixedThreadPool(10);
//		executorService.submit(new Threadrunnable("THREAD_A",0, 500));
//		executorService.submit(new Threadrunnable("THREAD_B",0, 1000));
//		executorService.submit(new Threadrunnable("THREAD_C",0, 2000));
		for(int i=0;i<10000;i++) {
			Threadrunnable temp=new Threadrunnable("THREAD-NO-"+i,0,500);
			//executorService.submit(temp);
			//threadManager.execute(temp);
			taskmanager.waitTillQueueIsFreeAndAddTask(temp);
			System.out.println("$$$$@@@@@"+i);
		}
		System.out.println("#############################################################");
		
	}
}
