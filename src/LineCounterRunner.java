//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   try {
		LineCounter a = new LineCounter(new Scanner(new File("LineCounter.txt")).next());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}