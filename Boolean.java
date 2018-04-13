package org.kandathil.vivek.DMOJ;

//libraries for getting user input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolean {

	public static void main(String[] args) throws IOException 
	{
		//new buffered reader to take in user input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//check input is a valid integer, catch exceptions
		try
		{
			//store each word in the input to array
			String[] words = in.readLine().split(" ");
			//get final boolean (true or false)
			String value = words[words.length - 1];
			//String to be used as output
			String booleanType = "";
			
			//switch to one of the two possibilities (true or false)
			switch(value)
			{
				//if value is "true", check how many 'not's there are
				case "True":
					//if even number of 'not's, it is true. Otherwise, it is false
					if((words.length - 1) % 2 == 0)
					{
						booleanType = "True";
					}
					else if((words.length - 1) % 2 != 0)
					{
						booleanType = "False";
					}
					break;
				//if value is "false", check how many 'not's there are
				case "False":
					//if even number of 'not's, it is false. Otherwise, it is true
					if((words.length - 1) % 2 == 0)
					{
						booleanType = "False";
					}
					else
					{
						booleanType = "True";
					}
					break;
			}
			
			//print final result, a "true" or "false" string
			System.out.println(booleanType);
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
