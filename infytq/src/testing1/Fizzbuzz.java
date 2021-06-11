package testing1;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		fizzbuzz(n);

	}
	public static void fizzbuzz(int n) {
		for(int i =1; i<=n;i++) {
		String out = "";
		if(i%3==0) out+="fizz";
		if(i%5==0)out+="buzz";
		if(out=="") out+=i;
		
		System.out.print(" "+out+" ");
		
		
		}
	}

}
