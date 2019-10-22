//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		try {
			File FileInput = new File("DogFood.txt");
			Scanner input = new Scanner(FileInput);
			while(input.hasNextLine())
			{
				DogFood a = new DogFood(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}