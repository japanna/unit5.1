/** Palindrome.java
 *  unit 5.1.5
 *  
 *  @author:  Anna Ntenta
 *  @version: Last Modified February 14, 2014
 */


import java.util.*;

class Palindrome
{
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

			if (isPalindrome(input)) {
				System.out.println("\n Yay! \"" + input + "\" is a palindrome!\n");
			}
			else {
				System.out.println("\nNay! \"" + input + "\" is NOT a palindrome!\n");
			}
		}
		// error message if user didn't provide a string
		else System.out.println("\n\nI'm sorry Dave. I'm afraid I can't let you do that.\nPlease write something that can be of type String.\n");
	}
}

