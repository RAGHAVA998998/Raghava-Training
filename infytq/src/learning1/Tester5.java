package learning1;
class Tester5 {
	
	static  int cutRod(int[] price, int n) {
		//Implement your logic here and change the return statement accordingly
		if (n==0)return 0;
		int[] f1 = new int[n+1];
		int count =0;//temporery storage of price
		int result = 0;//storage of best price till then
		f1[1]= price[0];
		for (int i =2;i<=n;i++){// we are iterating to add best prices for all (<n) values
		    for (int j=0;j<i;j++){//this is iterating for the best price combination
		       if (j==0) count = price[i-1];
		       else count= f1[i-j]+f1[j];
		       if (count>result){
		           result = count;
		           f1[i]= result;
		    }
		}
		
	}
	return f1[n];
	}

	public static void main(String[] args) {
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int n = 4;
		System.out.println("Maximum price: " + cutRod(price, n));
	}
}
