/*Two arrays are strictly identical if their corresponding elements are equal.
Write a program with class name StrictlyIdentical that prompts the user to enter two 
lists of integers of size 5 and displays whether the two are strictly identical.
*/
	import java.util.Scanner;
	
public class Strictly_Identical_Array {

	public static void main(String[] args) {
		// Scanning the user input
		
		Scanner input = new Scanner (System.in);
		
		//Prompting the user to enter 5 elements of list 1
		
		System.out.print("Enter List1: ");
		
		//imputing the Size
		
		int size = input.nextInt();
		
		// Declaring the first Array
		
		int [] List1 = new int [5];
		
		// setting up the for Loop and assigning  them  to elements of List 1
		
		for (int i=1; i<5; i++) List1[i]= input.nextInt();
		
		//Prompting the user to enter 5 elements of list 2
		
		System.out.print("Enter List2: ");
		
		// imputing size
		
		size=input.nextInt();
		
		//Declaring the second Array
		
		int [] List2 = new int[5];
		
		// setting up the for Loop and assigning  them  to elements of List 2
		
		for (int i=1; i<5; i++ ) List2[i] = input.nextInt();
		
		//introducing the if statement 
		
		if (equals(List1, List2)) {
			
			// Printing the text the two array are identical usinf if else statement
			
			System.out.println("The two Arrays are strictly identical");
		} else {
			System.out.println("The two Arrays are not strictly identical");
		}
	}
	// Creating a method equals outside the main method
	
	public static boolean equals(int[] List1, int[] List2) {
		
		// Creating boolean statement and assigning false value
		
		if (List1.length != List2.length) return false;
		
		// Using for loop
		
		for (int i=1; i<List1.length; i++) {
			
			// introducing if statement
			
			if (List1[i] != List2[i]) return false;	
			
		}
		return true;
			
	}
}

/*
Enter List1: 1 2 3 4 5
Enter List2: 1 2 3 4 5
The two Arrays are strictly identical

Enter List1: 1 2 3 4 5
Enter List2: 1 2 3 5 4
The two Arrays are not strictly identical

Enter List1: 23 55 31 2 10
Enter List2: 23 55 31 2 10
The two Arrays are strictly identical

Enter List1: 23 55 31 2 10
Enter List2: 23 55 2 31 10
The two Arrays are not strictly identical
 */
























