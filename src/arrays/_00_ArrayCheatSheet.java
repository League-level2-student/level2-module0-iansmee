package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] stuffs = {"stuff1", "stuff2", "stuff3", "stuff4", "stuff5"};
		//2. print the third element in the array
		System.out.println(stuffs[3]);
		//3. set the third element to a different value
		stuffs[3] = "stuff9";
		//4. print the third element again
		System.out.println(stuffs[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stuffs.length; i++) {
			System.out.println(stuffs[i]);
		}
		
		//6. make an array of 50 integers
		int [] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int p = 0; p < numbers.length; p++) {
			numbers[p] = new Random().nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(numbers[0]);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
	System.out.println(numbers[49]);
	}
}
