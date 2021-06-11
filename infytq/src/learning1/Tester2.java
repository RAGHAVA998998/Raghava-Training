package learning1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class Tester2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int arr[] = {8,5,2,1,3,12,47,25};
		int n = arr.length;
		int limit = n-1;
		System.out.println("the unsorted aray is :");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}
		int temp;
		boolean flag = false;
		for (int i=0; i<limit; i++) {
			if (arr[limit-i]<arr[limit-i-1]) {
			temp = arr[limit-i];
			arr[limit-i]=arr[limit-i-1];
			arr[limit-i-1]= temp;
			
			}
		}
			
		System.out.println("the sorted aray is :");
		for (int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ,");
		}
	
	}
	}

