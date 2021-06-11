package learning1;

public class QuickSort {
	public int pivotPartition(int[]arr,int start,int end) {
		int loc = end;
		for (int i=end;i<=start;i--) {
			if (arr[loc]<arr[i]) {
				swap(arr,loc,i);
				loc = i;
			}else continue;
		}
		return loc;
	}
public  void swap(int[] arr,int loc, int i) {
	int temp;
	temp = arr[i];
	arr[i]= arr[loc];
	arr[loc]= temp;
	
}
public static void quickSorting(int[]arr) {
	int n = arr.length;
	int start = 0;
	int end = n;
	int loc =pivotPartition(arr, 0, n);
	if ()
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,5,2,1,3,12,47,25};
		quickSorting(arr);
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}


	}

}
