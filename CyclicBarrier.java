import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
public class CyclicBarrier {
	public static void main(String[] args) throws InterruptedException,BrokenBarrierException {
		CyclicBarrier barrier = new CyclicBarrier(4);
		Party first = new Party(1000,barrier,"PARTY-1");
		Party second = new Party(2000,barrier,"PARTY-2");
		Party third = new Party(3000,barrier,"PARTY-3");
		Party fourth = new Party(4000,barrier,"PARTY-4");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		System.out.println(Thread.currentThread().getName()+"has finished");
		
	}

}

class Party extends Thread
{
	private int duration;
	
}
