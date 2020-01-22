package hk222su_assign_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackMain {
	
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	StackArray arr = new StackArray();
	
	while(true) {
	System.out.print("Please choose action : \n" +  
						"  1. Add String to the stack. \n"+
						"  2. Get the number of strings in the list. \n"+
						"  3. Print out last string. \n" + //REMEMBER ADD ISEMPTY TO THROW EXCEPTION
						"  4. Print out last string and remove it. \n" + //REMEMBER ADD ISEMPTY TO THROW EXCEPTION
						"  5. Quit \n"+ 
						"  ==> ");
	try {					
	int action = input.nextInt(); //Remember throw exception for letters/wrong input
	
	 if(action > 5 || action < 1) {
		 System.out.println("Please, choose number from the list");
	 }
	 
	 if (action == 5) {
		 break;
	 }
	 
	 if (action == 1) {
		 System.out.print("Enter the string : ");
		 String enter = input.next();
		 arr.push(enter);
	 }
	 
	 if (action == 2) {
		 System.out.println("The list contains: " + arr.size() + " Strings.");
	 }
	 try {
	 if (action == 3) {
		 System.out.println("Last string put in was: " + arr.peek());
	 }
	 }
	 
	 catch (ArrayStoreException e) {
		 System.out.println("List is empty - nothing to show");
	 }
	 
	 try {
	 if (action == 4) {
		 System.out.println("Last string put in was: " + arr.pop() + " and now it has been removed");
	 }
	 }
	 catch (ArrayStoreException e) {
		 System.out.println("List is empty - nothing to show");
	 }
	}
	 catch (InputMismatchException e) {
			System.out.println("This is not a valid input");
			input.next();
		}
	 System.out.println();
	 }
	
	System.out.print("Thanks and bye");
	input.close();	
	
	}	
	
	
	
	
	}


