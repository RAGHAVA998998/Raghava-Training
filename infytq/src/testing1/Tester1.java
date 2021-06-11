package testing1;
class Tester1 {
    public static int nextActivityIndex(int start[], int finish[], int finIndex){
        	int nextStartIndex=-1;
         int limit = finish[finish.length-1];
         for ( int temp = finish[finIndex];temp<=limit;temp++){
        for (int i=0;i<start.length;i++){
        	int startTime =start[i];
          if (temp==startTime){
              nextStartIndex = i;
              break;
          } 
        }if (nextStartIndex!=-1)break;
        }
         return nextStartIndex;
    }

	public static int findMaxActivities(int start[], int finish[]) { 
        //Implement your logic here and change the return statement accordingly
        int activity= 1;
        int index = 0;
        int limit = finish[finish.length-1];
        while(finish[index]<limit){
            index = nextActivityIndex(start,finish,index);
            if(index!=-1) {
            activity++;
            }else break;
        }
		return activity;
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 9, 8}; 
    	int finish[] =  {3, 5, 8, 10, 12, 13};
    	    
    	System.out.println("Maximum number of activities: "+findMaxActivities(start, finish)); 
    }
}
