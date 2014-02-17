/** Prob3.java
 *  unit 5.1.3
 *
 *  @author:  Anna Ntenta
 *  @version: Last Modified January 29, 2014
 */

import java.util.*;

enum Months { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG,
 SEP, OCT, NOV, DEC} ;

class Prob3
{
 	public static int daysInMonth (Months m)
 	{
 		int numDays = 0;
 		switch (m)
 		{ 
 		case JAN: case MAR: case MAY:
            case JUL: case AUG: case OCT:
            case DEC: 
            numDays = 31;
            break;

        case APR: case JUN:
            case SEP: case NOV: 
            numDays = 30;
            break;

        case FEB:
        	numDays = 28;
        	break;

        default:
                System.out.println("Invalid month.");
                break;
 		}	
 		return numDays;
 	}
 
 public static void main (String [] args)
 	{
 		for (Months m : Months.values() )
 		{
 			System.out.println (m + " has " + 
 			daysInMonth(m) + " days!");
 		}
 	}
}
