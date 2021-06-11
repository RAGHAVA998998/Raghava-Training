package testing2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Tester9 {

	
	 	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
		Collections.sort(list);
        Set<Integer> values = new HashSet<Integer>();
        for (int i:list){
            values.add(i);
        }
  
        List<Integer> listupdate = new LinkedList<Integer>();
        for (int i :values) {
        	listupdate.add(i);
        }
        Collections.sort(listupdate);
        return listupdate;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	}
	
	

	
	   /*---------------------------------------- 
	    class Tester9 {
	    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
		    //Implement your logic here and change the return statement accordingly
		    List <Integer> commonList = new LinkedList<Integer>();
		    for(int i :listOne){
		        for(int j:listTwo){
		            if (i==j){
		                commonList.add(i);
		            }
		        }
		    }
		    return commonList;
		}
		
		public static void main(String arga[]){

			List<Integer> listOne = new LinkedList<Integer>();
			listOne.add(10);
			listOne.add(12);
			listOne.add(21);
			listOne.add(1);
			listOne.add(53);
			
			List<Integer> listTwo = new LinkedList<Integer>();
			listTwo.add(11);
			listTwo.add(21);
			listTwo.add(25);
			listTwo.add(53);
			listTwo.add(47);

			System.out.println(findCommonElements(listOne, listTwo));
		}
		}
		---------------------------------*/



	
