package learning1;

class Customer {

	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}

}

class Tester {

	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer();

		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		customer.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output
		Customer c2= new Customer();
		c2.customerId ="C102";
		c2.customerName = "raghava reddy";
		c2.contactNumber= 6303781475L;
		c2.address ="3/33-1,sanjivapuram.tadipatri,anantapur,515445";
		c2.displayCustomerDetails();
	/*	Customer c3 = new Customer("c103","reddy", 8296871682L, "3/33-1");
		c3.displayCustomerDetails();*/
	}

}