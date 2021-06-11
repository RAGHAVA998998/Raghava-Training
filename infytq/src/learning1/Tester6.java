package learning1;

class Tester6 {

	public static int[][] multiply(int arr1[][],int arr2[][]) {
		//Implement your logic here and change the return statement accordingly
		int arr3[][]=new int[2][2];
		for (int i=0;i<arr1.length;i++){
		    for(int j=0;j<arr1[i].length;j++){
		    	for (int q=0;q<arr2.length;q++) {
		    		arr3[i][j]+=arr1[i][q]*arr2[q][j];
		    	}
		        
		    }
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		int arr1[][]=new int [][] {{2,4},{1,4}};
		int arr2[][]=new int [][] {{1,4},{1,3}};
		
		int[][] arr3=multiply(arr1,arr2);
		
		for(int index1=0;index1<arr3.length;index1++){
			for(int index2=0;index2<arr3.length;index2++){
				System.out.print(arr3[index1][index2]+" ");
			}
			System.out.println();
		}
	}
}

