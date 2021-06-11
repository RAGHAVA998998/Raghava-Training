package learning1;
import java.util.Scanner;

public class marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("how many subjects?: ");
	int n = sc.nextInt();
	int Marks[] = new int[n];
	int tot = 0;
	for (int i=0; i<n; i++) {
		System.out.println("enter marks for the" + (i+1)+"subject");
		Marks[i] = sc.nextInt();
		}
	for (int j=0; j<n;j++) {
		tot+=Marks[j];
		System.out.println("marks for "+ (j+1) +" subject is :"+ Marks[j]);
		System.out.println("total marks are :"+tot);
	}
	
}
}
