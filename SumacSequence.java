//Author: @vivekkandathil
//June 8, 2018
//Outputs length of sumac sequence between given min and max terms
//SOLUTION TO: https://dmoj.ca/problem/ccc11j3

import java.io.*;

public class SumacSequence 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//read user input for min and max terms
		int min = Integer.parseInt(in.readLine());
		int max = Integer.parseInt(in.readLine());
		
		//print out length of sumac sequence
		System.out.println(f(min,max));
		
	}
	
	public static int f(int a,int b)
	{
		//ternary operator: returns 1 if b is less than 0, and the next term if not
		return b < 0 ? 1:1 + f(b, a - b); 
	}

}
