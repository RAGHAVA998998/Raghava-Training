package testing1;



import java.io.*;
import java.util.*;

/**
 * @author APPLE
 *find if num is palindrome if not add the num and reverse of num.
 *check if the sum is a palindrome. if not conntinue the process until
 *the palindrome is found
 */
class myfile
{
    public static int[] converToArray(int num){
    	int len = Integer.toString(num).length();
        int[] arr;
        arr = new int[len];
        int i =0;
        while (num/10!=0){
            int rem = num%10;
            arr[i]=rem;
            i=i+1;
            num=num/10;
        }
        arr[len-1]=num;
        System.out.println(arr);
        return arr;
    }
    public static boolean checkPalindrome(int num){
        int[] arr=converToArray(num);
        int n = arr.length;
        boolean palindrome= true;
        for (int i =0; i<n;i++){
            if (arr[i]==arr[n-1-i]) {
                palindrome=true;}
                else {
                	palindrome=false;
                	break;}
        }
        return palindrome;
    }
    public static int reverseNum(int num){
        int[]arr=converToArray(num);
        int n = arr.length;
        int reverse = arr[0];
        for (int i = 1; i<n;i++){
            reverse=(reverse*10)+arr[i];
        }
        return reverse;
    }
    public static int findPalindrome(int num){
       // boolean palindrome = checkPalindrome(num);
    	boolean palindrome = false;
        while (palindrome != true ){ 
            int reverse= reverseNum(num);
            num = num+reverse;
            palindrome = checkPalindrome(num);
        }
        return num;
    }
    public static void main (String[] args)//throws java.lang.Exception
    {
        
      Scanner s = new Scanner(System.in);
     int num = s.nextInt();
        
        System.out.println("Hello");
        int palindrome = findPalindrome(num);
        System.out.println("the palindrome in the process : "+palindrome);
    }
}