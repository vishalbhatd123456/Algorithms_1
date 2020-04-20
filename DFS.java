import java.io.*;
import java.util.*;
public class DFS {
	public static int MAX = 10;
	static Scanner scan = new Scanner(System.in);
	static int visited[] = new int[MAX];
	static int A[][] = new int[MAX][MAX];
	static int n;
	public static void main(String[] args) {
	
		ReadAdjMatrix();
		System.out.println("Enter the starting vertex:");
		int start = scan.nextInt();
		dfs(start);
	}
	static void ReadAdjMatrix()
	{
		System.out.println("Enter the number of vertices");
		 n = scan.nextInt();
		System.out.println("Enter the adjacency matrix:");
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				A[i][j] = scan.nextInt();
			}
		}
	}
	static void dfs(int v)
	{
		int w;
		visited[v] = 1; //visit a vertex
		for(w=1;w<=n;w++)
		{
			if(visited[w] == 0 && A[v][w]==1)
			{
				System.out.print("->"+w);
				dfs(w);
			}
		}
	}

}
