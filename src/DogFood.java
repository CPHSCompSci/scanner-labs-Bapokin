//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		String input = chopper.nextLine();
		String[] numbers = input.split(" ");
		int[] finalNum = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++)
		{
			finalNum[i] = Integer.parseInt(numbers[i]);
		}
		double cups = 0;
		for(int Num: finalNum)
		{
			cups += getAmount(Num)*7;
		}
		cups = cups/60;
		double bags = Math.ceil(cups);
		System.out.println(bags);
		int finalBags = (int)bags;
		System.out.println(finalBags + " - 10 POUND BAGS");

		
		//calc code goes here

   }

   public double getAmount(int weight)
   {
	if(weight>=80)
	{
		return 7.5;
	}
	else if(weight >= 60)
	{
		return 6.0;
	}
	else if(weight >= 40)
	{
		return 4.5;
	}
	else if(weight >= 20)
	{
		return 3.5;
	}
	else if(weight >= 10)
	{
		return 2.0;
	}
	else if(weight >= 8)
	{
		return 1.5;
	}
	else if(weight >= 5)
	{
		return 1.0;
	}
	else if(weight >= 2)
	{
		return 0.5;
	}
   	return 0;
   }

	public String toString()
	{
		return "";
	}
}