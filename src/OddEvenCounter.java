//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   try {
		Scanner input = new Scanner(new File("OELine.txt"));
		while(input.hasNextLine())
		{
			line = input.nextLine();
			System.out.println(line);
			System.out.println("Odd count: " + getOddCount());
			System.out.println("Even count: " + getEvenCount());
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   public OddEvenCounter(String s)
   {
   }

	public void setLine(String s)
	{
	}

	public int getEvenCount()
	{
		int count= 0;
		Scanner input2 = new Scanner(line);
		while(input2.hasNextInt())
		{
			if(input2.nextInt()%2 == 0)
			{
				count++;
			}
			
		}
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
		Scanner input2 = new Scanner(line);
		while(input2.hasNextInt())
		{
			if(input2.nextInt()%2 == 1)
			{
				count++;
			}
			
		}
		return count;
	}

	public String toString( )
	{
		return "";
	}
}