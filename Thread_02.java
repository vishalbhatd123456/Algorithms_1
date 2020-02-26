import java.util.concurrent.*;
import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;
public class Thread_02 {
	
	public static void main(String[] args) throws Exception {
		Server myServer = new Server();
		Thread t1 = new Thread();
		t1.start();
		
		//Lets stop our server thread
	myServer.stop();
	TimeUnit.MILLISECONDS.sleep(200);
	System.out.println(currentThread().getName()+"is finished now: ");
	
	
	}
	

}
class Server implements Runnable
{
	private volatile boolean exit = false;
	public void run()
	{
		while(!exit){
			System.out.println("Server is running..........");
			
		}
		System.out.println("Server is stopped.....");
	}
	public void stop()
	{
		exit = true;
		
	}
}
