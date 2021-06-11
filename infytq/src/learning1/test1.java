package learning1;
//import learning1.InsertSort;
public class test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,5,2,1,3,12,47,25};
		InsertSort.insertSorting(arr);
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}
	}
}
