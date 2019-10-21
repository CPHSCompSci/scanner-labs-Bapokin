//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;
import java.io.*;
public class LineCounter
{
   private String line;

   public LineCounter()
   {
	   
	   
   }

   public LineCounter(String s)
   {
	   try {
			Scanner input = new Scanner(new File("LineCounter.txt"));
			while(input.hasNextLine())
			{
				String line = input.nextLine();
		   		System.out.println(line);
		   		int intCount = 0;
		   		Scanner number = new Scanner(line);
		   		while(number.hasNextInt())
		   		{
		   			intCount++;
		   			number.nextInt();
		   		}
		   		System.out.println("Number of numbers: " + intCount);
			}
//			int lineCount = 0;
//			   while(input.hasNextLine()==true)
//				{
//					lineCount++;
//					input.nextLine();
//				}
//			   for(int i = 0; i <= lineCount; i++)
//				   {
//				   		String line = input.nextLine();
//				   		System.out.println(line);
//				   		int intCount = 0;
//				   		while(new Scanner(line).hasNextInt())
//				   		{
//				   			intCount++;
//				   		}
//				   	 System.out.println(intCount);
//				   	 i++;
//				   }
//			  
//				setLine("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

	public void setLine(String s)
	{
	}

	public int getCount()
	{
		int count=0;	
		return count;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return getLine();
	}

//	public void everything() throws FileNotFoundException 
//	{
//		Scanner input = new Scanner(new File("LineCounter.txt"));
//		try {
//			input = new Scanner(new File("LineCounter.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int lineCount = 0;
//		while(input.hasNextLine()==true)
//		{
//			lineCount++;
//			input.nextLine();
//		}
//		ArrayList<String> lineInput = new ArrayList();
//		for(int i = 0; i <= lineCount; i++) 
//		{
//			lineInput.add(input.nextLine());
//		}
//		for(int i = 0; i <= lineCount; i++)
//		{
//			Scanner line = new Scanner(lineInput.get(i));
//			int intCount = 0;
//			while(line.hasNextInt() == true)
//			{
//				intCount++;
//			}
//			System.out.println(line.nextLine());
//			System.out.println("Integer count: " + intCount);
//		}
//	}
	
}