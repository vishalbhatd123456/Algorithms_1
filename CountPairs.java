import java.util.*;
public class Count_pairs {
	public static int get_Pairs(int n, int ar[])
	{
		int pairs = 0;
		Set<Integer> color = new HashSet<>();
		for(int i =0;i<n;i++)
		{
			if(!color.contains(ar[i])){
				color.add(ar[i]);
			}else{
				pairs++;
				color.remove(ar[i]);
			}
		}
		return pairs;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of eleements");
		int n = scan.nextInt();
		System.out.println("Enter the array elements:");
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = scan.nextInt();
		}
		int res = get_Pairs(n, ar);
		System.out.println("the number of pairs is"+res);
		scan.close();
	}

}
