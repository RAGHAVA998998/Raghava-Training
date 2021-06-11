
package testing1;

class Customer {	
public String customerId;
	public String customerName;
	public long customerNumber;
	public String customerAdd;
	public void displayCustomerDetails(){
	    System.out.println(customerId);
	    System.out.println(customerName);
	    System.out.println(customerNumber);
	    System.out.println(customerAdd);
	}
	
    public void gettingData(String cId,String cName,long cNumber, String add){
     customerId = cId;
     customerName = cName;
     customerNumber = cNumber;
     customerAdd = add;
	}
class Test {

	public static void main() {
		Customer customer = new Customer();
	customer.gettingData("01234", "thirumalai", 8428602412l, "lakkam" );
		customer.displayCustomerDetails();
}
}
