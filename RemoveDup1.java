
public class RemoveDup1 {
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,4,4,5,5};
		int n = 10;
		int temp[] = new int[10];
		int j=0; //record the indices in the temp array
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j] = arr[i];
				System.out.println("The non-duplicate element:"+temp[j]);
				j++;
				
			}
	
		}
		temp[j] = arr[n-1];
		System.out.println("The last non-duplicate element:"+temp[j]);
	//	printArray(arr, n);
//		for(int i =0;i<n-1;i++)
//			System.out.print(arr[i]+"\t");
//		
//	}
	
	}
}
