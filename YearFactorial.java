//Vivek Kandathil
//February 28th, 2018

package org.kandathil.vivek;

import java.math.BigInteger;
import java.util.Calendar;

public class YearFactorial 
{
	//Assign 1 to BigInteger variable that will contain the factorial value
	static BigInteger f1 = BigInteger.valueOf(1);
	
	public static void main(String[] args) 
	{
		//Get value of current year (number that will have its factorial value calculated)
		int yearValue = Calendar.getInstance().get(Calendar.YEAR);
		
		//i <= year to ensure that current year is multiplied as well
		for (int i = 1; i <= yearValue; i++)
		{
			//Multiply f1 by every integer below it that is greater than or equal to 1
			f1 = f1.multiply(BigInteger.valueOf(i));
		}
		
		//Take the amount of zeroes from the getZeroes method
		int zeroes = YearFactorial.getZeroes(yearValue);
		
		System.out.println("The factorial of " + yearValue + " has " + zeroes +  " trailing zeroes");
	}
	
	static int getZeroes(int year)
	{
		int count = 0;
		
		//Continually divide value by increasing powers of 5
		for (int i = 5; (year / i) >= 1; i *= 5)
		{
			count = count + (year / i); //Add resulting int value
		}
		return count;
	}
	
	/*
	 * Let n = the current year (ex. 2018)
	 * The number of trailing zeroes in n! can be found by:
	 * - dividing n by consecutive powers of 5, taking the value of the closest integer below it
	 * - continuing until the denominator of 5^x is greater than n, and adding the resultant values
	 * Therefore, the number of trailing zeroes in 2018! is:
	 * (2018/5) + (2018/5^2) + (2018/5^3) + (2018/5^4) = 502
	 */
}
