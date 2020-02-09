
public class RecursionBulb1 {
	
	public static  void NextRoom(int n)
	{
		RoomSwitch(n);
		NextRoom(n-1);
	}
	public  static void RoomSwitch(int n1)
	{
		System.out.printf("Switching on the bulb of %d\n",n1);
	}
	public static void main(String[] args) {
		System.out.println("Implementing the 2 phases of recusrsion: Ascending Phase and the descending phase");
		NextRoom(100);
	}

}
