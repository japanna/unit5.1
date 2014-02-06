/** DigitSum.java
 *  unit 5.1.2
 *
 *  @author:  Anna Ntenta
 *  @version: Last Modified February 6, 2014
 */

import java.util.*;

class DigitSum 
{
	public static int DigitSum(int n)
	{
		// base case
		if (n < 10)
		{
			return n; 	
		}
		// recursive case
		else			
		{	
    		int digit = n % 10; // digit gets the last number in the int
    		return digit + DigitSum(n / 10); 
		}
	}

	public static void main (String [] args)
	{
		System.out.println(DigitSum(3456));
	}

}