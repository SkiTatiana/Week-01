//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
		
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availablePlaneSeats = 22;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 127.66;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'm';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Frederich";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "666 Elm St";

		// 7. Print all variables to the console
		System.out.println("Available seats:" + availablePlaneSeats);
		System.out.println("Cost of groceries:" + costOfGroceries);
		System.out.println("Middle initial:" + middleInitial);
		System.out.println("Is it hot outside:" + isHotOutside);
		System.out.println("Customer's first name:" + customerFirstName);
		System.out.println("Street Address:" + streetAddress);
		
		System.out.println();
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
		

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'S';
		System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = true;
		System.out.println(isHotOutside);
		

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerLastName = "Krueger";
		//System.out.println(customerFirstName + middleInitial + customerLastName);
		//System.out.println(customerFirstName + " " + middleInitial + " " +  customerLastName);
		String fullName = customerFirstName + " " + middleInitial + " " +  customerLastName;
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println(fullName + " "+ "lives at\n" + " " + streetAddress);
		
	}
}