package learning1;

public class Tester4 {
	static int  findChange(int amount, int[] denominations) {
		int num=0;
		while (amount !=0) {
			for (int i=0; i<denominations.length;i++) {
				if(denominations[i]<=amount) {
					num++;
					amount-=denominations[i];
					break;
				}
			}
		}
		
		
		return num;
	}
	
	
	
	public static void main(String[] args) {
		int[] denominations = {100,50,20,10,1}; //the denomination are in descending order
		int amount=67;
		int noOfNotesChange =findChange(amount, denominations);
		System.out.println("no of notes given as change is: " + noOfNotesChange);
		
	}
}
