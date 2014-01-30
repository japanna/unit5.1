/** GCD.java
 *  
 *  finds the greatest common divisor
 *  
 *  @author:  Anna Ntenta
 *  @version: Last Modified January 30, 2014
 */

import java.util.*;

class GCD
{

/** 
 *  
 *
 *  @param   int x  
 *  @param   int y  
 *  @return  int z  greatest common divisor
 */
	public static int gcd(int x, int y)
	{
		// if either of or both parameters are negative,
		// return gcd of absolute values
		if (x < 0 || y <0)  {
			return gcd(Math.abs(x), Math.abs(y));
		// base case	
		} else if (y == 0){
			return x;
		// recursive case, y > 0	
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main (String [] args)
	{
		int result = gcd(18, 12);
		System.out.println("Greatest common divisor is: " + result);
	}
}
	