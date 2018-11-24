package org.kandathil.vivek.ccc;
import java.io.*;
import java.util.*;

public class FractionSimplifier 
{
	public static void main(String[] args) throws IOException
	{
    //get numerator and denominators as input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int den = Integer.parseInt(in.readLine());
		
    //print whole quotients immediately
		if (num % den == 0)
			System.out.println(num/den);
    //check for improper fractions, format to mixed
		else if (num > den)
			System.out.println(mixed(num,den));
    //simplify every other case
		else
			System.out.println(simplify(num,den));
	}
	
	static String mixed(int n, int d)
	{
    //use remainder in mixed fraction
		int r = n % d;
		int whole = (n-r)/d;
    //simplify non-whole component
		return Integer.toString(whole) + " " + simplify(r,d);
	}
	
  //method for simplifying proper fractions
	static String simplify(int n, int d)
	{
    //call gcd method, this will be divided into both the numerator and denominator to simplify it
		int factor = gcd(n,d);
		if (factor > 1)
		{
			n /= factor;
			d /= factor;
		}
		return Integer.toString(n) + "/" + Integer.toString(d);
	}
	
  //using euclid's algorithm, simplified with ternary operator
	static int gcd(int a, int b)
	{
		return (b == 0) ? a : gcd(b, a % b);
	}
}
