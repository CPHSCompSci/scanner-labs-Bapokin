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
	   try {
			Scanner input = new Scanner(new File("LineCounter.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   while(input.hasNextLine()==true)
		{
			lineCount++;
			input.nextLine();
		}
		setLine("");
   }

   public LineCounter(String s)
   {
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
		try {
			input = new Scanner(new File("LineCounter.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		int lineCount = 0;
		while(input.hasNextLine()==true)
		{
			lineCount++;
			input.nextLine();
		}
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