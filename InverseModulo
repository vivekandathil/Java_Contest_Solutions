package org.kandathil.vivek.DMOJ;

//BigInteger
import java.math.BigInteger;
//libraries for user input
import java.io.*;

public class InverseModulo {

	public static void main(String[] args) 
	{
		//BufferedReader for user input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	     // create 2 BigInteger objects for input
	     BigInteger a, b, inverseMod;
	     
	     try 
	     {
	    	 	//BigInteger objects, to be used for inverse mod calculation
			a = new BigInteger(String.valueOf(in.readLine()));
			b = new BigInteger(String.valueOf(in.readLine()));
			
		     //perform modInverse operation
		     inverseMod = a.modInverse(b);
		     
		     // print bi3 value
		     System.out.println(inverseMod.intValue());
		} 
	    //catch input exceptions
	    catch (IOException e) 
	    {
			e.printStackTrace();
	    }
	    //indicate if no integers work for the inverse mod
	    catch(ArithmeticException e)
	    {
	    		System.out.println("No such integer exists.");
	    }
	}

}
