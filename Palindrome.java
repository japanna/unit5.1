// Palindrome.java, unit 5.1.5

/** 
 *  This class contains the method isPalindrome, which takes a String as argument 
 *	and returns true or false depending on whether the argument is a palindrome.
 *  
 *	I have made the assumption that numbers, although they can be strings, are not proper
 *  palindromes on their own. Example: "303" is not a palindrome according to this program.
 *  However, "3wow4" is a palindrome since the program accepts, but doesn't take into account, 
 *  punctuation and numbers.
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified February 17, 2014
 */


import java.util.*;

public class Palindrome
{

/**
    * This method takes a String as argument and returns true or false
 	* depending on whether the argument is a palindrome.
    *
    * @param   str  A string received from user
    * @return  		True or False depending on whether input is a palindrome
    */	
	public static boolean isPalindrome (String str)
	{
		// get the length of the original string once
		int original_len = str.length();
		// convert all chars to uppercase
		String upper = str.toUpperCase();
		// create new string builder
		StringBuilder newString = new StringBuilder();

		// build new string that consists of only letters
		for(int i = 0; i < original_len; i++)
		{
			if (Character.isLetter(upper.charAt(i))) {
			newString.append(upper.charAt(i) );
			}
		}
		// convert string builder to string
		String s = newString.toString();
		// get length of new string
		int len = s.length();

		
		// base case
		if (len <= 1) {
			return true;
		}
		// recursive case
		// if first and last char are the same
		if (s.charAt(0) == s.charAt(len - 1)) 
		{
			// create a substring
			String sub = s.substring(1, len - 1);
			// check if the substring is a palindrome
			return isPalindrome(sub);
		}
		// if first and last char are *not* the same it's not a palindrome
		else 
			return false;
	}
	

public static void main (String [] args)
	{
		// create Scanner object
		Scanner in = new Scanner (System.in);

		System.out.print ("Please write a sentence: ");

		// make sure that user provided correct input
		if(in.hasNextLine()) {

			String input = in.nextLine();

			// Count the number of letters in input
			int counter = 0;
			for(int i = 0; i < input.length(); i++)
			{
				if (Character.isLetter(input.charAt(i))) {
				counter++;
				}
			}
			// Check that the input contains at least one letter
			if (counter == 0) {
				// if no letters in input, print error msg
				System.out.println("Your sentence contains no letters. Please try again.");
				return;
			} 

			if (isPalindrome(input)) {
				// if the sentence is all letters
				if (counter == input.length()){
				System.out.println("\n Yay! \"" + input + "\" is a palindrome!\n");
				}
				// if the sentence contains punctuation and/or numbers etc.
				else {
				System.out.println("\n Yay! \"" + input + "\" is a palindrome! (We only look at the letters.)\n");
				}

			}
			else {
				System.out.println("\nNay! \"" + input + "\" is NOT a palindrome!\n");
			}
		}
		// error message if user didn't provide a string (for instance ^D)
		else System.out.println("\n\nI'm sorry Dave. I'm afraid I can't let you do that.\nPlease write something that is of type String.\n");
	}
}

