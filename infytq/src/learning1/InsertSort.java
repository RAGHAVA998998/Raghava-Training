package learning1;

/**
 * @author APPLE
 * 
 * this is insertsort. the analogy of this is 
 * take a sorted deck. take a new card and place this new card  in the deck in its 
 * correct place in the deck.
 * so start with index[1] in the array as a new card and the deck has index[0] card. now place the new card in its correct place.
 * similarly the deck is the forst 2 numbers i.e. index [0],[1]. index [2] becomes the card to be places at the new position.
 *  
 *
 */
public class InsertSort {
	
	public  void insertNewNum(int[] arr,int i) {
		int key = arr[i];
		for (int j=i-1;j>=0;j--) {
			if (key < arr[j]) {
				arr[j+1] = arr[j];
				arr[j] = key;
			}
		}
	}
	public  void insertSorting(int[] arr) {
		int n = arr.length;
		for (int i=1; i<n;i++) {
			insertNewNum(arr, i);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,5,2,1,3,12,47,25};
		InsertSort I1 = new InsertSort();
		I1.insertSorting(arr);
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ,");
		}
	}


}
