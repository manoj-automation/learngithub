package newpackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeapYear {
	public static void main(String[] args)
	{  
		  
		
		String test1 = "all";
		int length = test1.toCharArray().length;
		
		//int test [] = {1,2,3,4,5};
		for (int i=2;i<=length;i--)
		{
			System.out.print(test1.charAt(i));
			if(i==0)
			{
				break;
			}
		}
				
	}
		

       
}   


