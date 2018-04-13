package org.kandathil.vivek.DMOJ;

//user input libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BigInteger
import java.math.BigInteger;

public class NextPrime 
{
	public static void main(String[] args) throws java.lang.Exception
	{
		//new buffered reader to take in user input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//check input is a valid integer, catch exceptions
		try 
		{
			//Convert string input to BigInteger data type
			BigInteger size = new BigInteger(String.valueOf(in.readLine()));
			
			//Check to see if number is already prime (1-(1/2^100) certainty)
			if(size.isProbablePrime(100) == true)
			{
				//print number if already prime
				System.out.println(size);
			}
			else
			{
				//check for the next prime number, convert to long
				long nextPrime = Long.parseLong(size.nextProbablePrime().toString());
				System.out.println(nextPrime);
			}
		}
		//catch input exceptions
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
