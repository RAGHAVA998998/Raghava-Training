package learning1;

public final class BubbleSort {

	public static boolean pass(int[] arr,int i) {
		int n = arr.length;
		int limit = n-1;
		int temp;
		boolean flag = false;
		for(int j=0;j<limit-i;j++) {
			if (arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag= true;
			}
			}
		return flag;
	}
	public static  void bubbleSorting(int[]arr) {
		int n = arr.length;
		int limit = n-1;
		boolean flag;
		for (int i=0; i<limit; i++) {
			flag = pass(arr,i);
			if (flag=false) break;// if flag is false after a j loop. then no swap is done.
			//and it means the array is alreay sorted.
			else flag=false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,5,2,1,3,12,47,25};
		BubbleSort b1 = new BubbleSort();//create a object to run the methods as they are non static methods
		b1.bubbleSorting(arr);
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}
	}

}
