import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;
public class Thread_3 {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		
		Thread t1 = new Thread(game,"T1");
		t1.start();
		
		//stop the game thread
		
		System.out.println(currentThread().getName()+"Is stoppuing the thread");
		game.stop();
		try{
		TimeUnit.MILLISECONDS.sleep(200);
		System.out.println(currentThread().getName()+" is finished now:");
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}

class Game implements Runnable{
	
	private boolean isStopped = false;
	
	public void run()
	{
		while(!isStopped){
			System.out.println("Game thread is running.....");
			System.out.println("Game thread is now going to pause:");;
			try{
				Thread.sleep(200);
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("game thread is now resumed...");
		}
		System.out.println("Game thread is stopped....");
		
	}
	public void stop()
	{
		isStopped = true;
	}
}
