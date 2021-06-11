package testing1;

public class Bank {
public void getBankName() {
System.out.println("bank");
}
public static void main(String[] args) {
	ABCBank bank = new ABCBank();
	bank.getBankName();
}
}
class ABCBank extends Bank{
	public void getBankName() {
		System.out.println("ABCbank");
		
	}
}

