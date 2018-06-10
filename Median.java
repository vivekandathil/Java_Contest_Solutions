//@author: vivekandathil
//June 10th, 2018
//SOLUTION TO: https://dmoj.ca/problem/dmopc14c1p1

package org.kandathil.vivek.DMOJ;

import java.io.*;
import java.util.Arrays;

public class Median 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader for user input
		
		int size = Integer.parseInt(in.readLine()); //for array length (part of question input)
		
		double[] tests = new double[size]; //array to hold input data
		
		//populate array with input values
		for(int i = 0; i < size; i++)
		{
			tests[i] = Integer.parseInt(in.readLine());
		}
		
		//sort array
		Arrays.sort(tests);
		
		//ternary operator to calculate median, depending on whether array length is even or odd
		double median = (tests.length % 2 == 0) ? (tests[tests.length/2] + tests[tests.length/2 - 1])/2:tests[tests.length/2];
		
		//output median, rounded to nearest integer, as per mathematical conventions
		System.out.println(Math.round(median));
	}

}
