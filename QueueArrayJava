import java.util.Scanner;
class Queue
{
	int n;
	static int arr[];
	public Queue(int n)
	{
		this.n = n;
		arr = new int[n];
		
	}
	static int f=-1,r=-1;
	
	//int arr[] = new int[n];
	public void enqueue(int x)
	{
		if(r== n-1)
		{
			System.out.println("The queue is FULL");
		}
		else
		{
			r++;
			arr[r] = x; //insertion of the element at the index
		}
		
	}
	public int deque()
	{
		int x = -1;
		if(r==f)
		{
			System.out.println("the given queue is EMPTY");
		}
		else
		{
			f++;
			x = arr[f];
			
		}
		return -1;
	}
	
public void display()
{
	for(int i=r;i<=f;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
}
	
	
}
public class QueueArrayJava {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int n = scan.nextInt();
		Queue q = new Queue(n);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.display();
	}
}
