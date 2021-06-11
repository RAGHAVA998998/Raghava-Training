package learning1;

public class SelectionSort {
	public static int findSmallestNum(int arr[],int start ) {

		int n = arr.length;
		int loc=start;
		for(int i =start; i<n;i++) {
			if (arr[loc]<arr[i])
				continue;
			else 
				loc=i;
		}
		
		return loc;
	}
	public static void swap(int[] arr,int start, int loc) {
		int temp;
		temp = arr[start];
		arr[start]= arr[loc];
		arr[loc]=temp;
	} 
	public static void selectionSorting(int[]arr) {
		int n = arr.length;
		int loc;
		for (int i=0; i<n;i++) {
			int start = i;
			loc = findSmallestNum(arr,start);
			swap(arr,start,loc);
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,5,2,1,3,12,47,25};
		selectionSorting(arr);
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}

	}

}
