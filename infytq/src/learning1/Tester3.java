package learning1;
import java.util.Arrays;

public class Tester3 {
	
	/**
	 * @param arr
	 * @return
	 * a method to generate a array withod duplicates and store it in a new array
	 */
	static int[] unDuplicateArray(int[]arr){
		Arrays.sort(arr);		//sort the array
		int[] arr1= new int[arr.length];
		int j=0;
		for (int i=1;i<arr.length;i++) {
			arr1[0] = arr[0];
			if (arr[i]!=arr[i-1])
				arr1[++j]= arr[i];
		}
			int[] arr2 =new int[j+1];
			for(int i=0;i<=j;i++) {
				arr2[i] = arr1[i];
			}
		
	return arr2;
	}
	/**
	 * @param arr
	 * @return
	 * finds the max num in array which not repeated
	 * if there is no unrepeated num then 
	 * returns -1
	 */
	static int maxUnRepeated(int[]arr) {
		int[] arr2 = unDuplicateArray(arr);
		
		
		for (int i=arr2.length-1;i>=0;i--) {
			int repeated = -1;
		for (int j =arr.length-1;j>=0;j--) {
			if(arr2[i]==arr[j]) {
				repeated++;
			}
			if (repeated>0) break;
		}if(repeated==0)
			return arr2[i];
		}
				
		return -1;
		
	}
	static void display(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ ", ");
			
	}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,3,9,4,9,8,3,1};
		int[] arr2 = {9,9,8,8};
		
		display(arr);
		display(unDuplicateArray(arr));
		System.out.println(maxUnRepeated(arr));
		System.out.println(maxUnRepeated(arr2));
	}

}
