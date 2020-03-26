package testcoding.practcecoding;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tesr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		String text=" I am an automation engineer ";
		text= text.replaceAll("\\s","");
		text=text.toLowerCase();
		System.out.println(text);
        char[] alpha = text.toCharArray();
        int n = alpha.length;
        char[] delta = new char[alpha.length];
        for(int i=0;i<n;i++)
         {
        	
        	char temp= alpha[i];
        	for(int k=0;k<delta.length;k++)
        	{
        	if(alpha[i]!=delta[k]||' ')
        	delta[i] = alpha[i];
        	System.out.println(delta[i]);
        	for(int j=0;j<n;j++)
         	{
        		
        		if(temp==alpha[j])
        		{
        			count++;
        			
        		}
       
        		
		}
     		System.out.println(temp+" "+ "count is"+" "+count);
     		count =1;
    		
        	
        	
        	
        	
	}
        
	}
}


