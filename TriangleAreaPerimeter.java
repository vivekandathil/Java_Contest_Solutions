//Author: @vivekkandathil
//June 8, 2018
//SOLUTION TO: https://dmoj.ca/problem/geometry1

//Input: One line containing N, the number of triangles to follow. 
//The next N lines contain 6 integers separated by single spaces: x,y of each X,Y,Z.

package org.kandathil.vivek.complete;

import java.io.*;
import java.util.ArrayList;

public class TriangleAreaPerimeter 
{
	public static void main(String[] args) throws IOException
	{
		//buffered reader to read user input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int numTriangles = Integer.parseInt(in.readLine());
		ArrayList<Integer> xVals = new ArrayList<Integer>(); //arraylist to hold x and y coordinates
		ArrayList<Integer> yVals = new ArrayList<Integer>();
		
		//loop through every subsequent line in input
		for(int i = 0; i < numTriangles; i++)
		{
			String next[] = in.readLine().split(" "); //Read coordinates
			double side1,side2,side3,perimeter,s,area; //area, perimeter calculation variables

			xVals.clear(); //clear ArrayLists for next triangle
			yVals.clear();
			
			//iterate through each value of the line to determine coordinates
			for(int j = 0; j < next.length; j++)
			{
				if (j % 2 == 0) //add every odd value to x coordinates
					xVals.add(Integer.parseInt(next[j]));
				else  //add every even value to y coordinates
					yVals.add(Integer.parseInt(next[j]));
			}
			
			//HERON FORMULA CALCULATIONS
			side1 = Math.hypot(xVals.get(2) - xVals.get(1), yVals.get(2) - yVals.get(1));
			side2 = Math.hypot(xVals.get(1) - xVals.get(0), yVals.get(1) - yVals.get(0));
			side3 = Math.hypot(xVals.get(2) - xVals.get(0), yVals.get(2) - yVals.get(0));
			
			perimeter = side1 + side2 + side3;
			s = (perimeter)/2;
			area = Math.sqrt((s * (s-side1) * (s-side2) * (s-side3)));
			
			//Output area and perimeter to 2 decimal places
			System.out.println(Math.round(area * 100.0) / 100.0 + " " + Math.round(perimeter * 100.0) / 100.0);
		}
	}

}
