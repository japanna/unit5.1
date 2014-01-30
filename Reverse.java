/** Reverse.java
 *  
 *  
 *  @author:  Anna Ntenta
 *  @version: Last Modified January 30, 2014
 */

import java.io.*;
import java.util.*;

class Reverse
{

/** 
 *  reverse accepts a file
 *  and prints each row of the file in reverse order
 *
 *  @param   input    	 a file
 *  
 */
	public static void reverse(Scanner input)
	{
				if (input.hasNextLine())
			{
				String line = input.nextLine();
				reverse(input);
				System.out.println(line);
			}
	}

	public static void main (String [] args)
	{
		try {
			Scanner scanfile = new Scanner(new File("reverse_test.txt"));
			reverse(scanfile);
		}
		catch (FileNotFoundException e) {
    		System.err.println("FileNotFoundException: " + e.getMessage());
   		}
	}
}

