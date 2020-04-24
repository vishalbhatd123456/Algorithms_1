import java.util.Scanner;
class Queue
{
	int n;
	 int arr[];
	  int f,r;
	public Queue(int n)
	{
		f = -1;
		r = -1;
		this.n = n;
		arr = new int[n];
		
		
		
	}

	
	//int arr[] = new int[n];
	public void enqueue(int x)
	{
		if(r==n-1)
		{
			System.out.println("The queue is FULL");
			return;
		}
		else
		{
			r++;
			arr[r] = x; //insertion of the element at the index
			System.out.println("The item inserted is "+x);
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
			System.out.println(x);
			
		}
		return -1;
	}
	
public void display()
{
	System.out.println("the queue elements are");
	if(r==f)
	{
		System.out.println("EMPTY QUEUE");
		System.exit(0);
	}
	for(int i=f+1;i<=r;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	System.out.println();
}
	
	
}
public class QueueArrayJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int n = scan.nextInt();
		Queue q = new Queue(n);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.deque();
		
		q.display();
	}
}
