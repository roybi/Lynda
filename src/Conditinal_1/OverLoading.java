package Conditinal_1;

 
import java.util.Scanner;
import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;

public class OverLoading {

	public static void main(String[] args)
	{
		 String s1 = getInput("Enter Value 1");
		 String s2 = getInput("Enter Value 2");
		 String s3 = getInput("Enter Value 3");
		 
		 double result = addValue(s1, s2);
		 System.out.println("The answer is "+ result);
		 
		 double result2 = addValue(s1, s2, s3);
		 System.out.println("The answer is with s3 "+ result2);
		 
		 double result3 = addValue(s1, s2, s3, s1, s2, s3);
		 System.out.println("The answer is with s3 "+ result3);

	}

	static String getInput(String prompt)
	{
		System.out.print (prompt);
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	static double addValue(String s1,String s2)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1+d2;
		return result;
					
	}
	
	static double addValue(String s1,String s2, String s3)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double d3 = Double.parseDouble(s3);
		double result = d1+d2+d3;
		return result;
	}
	
	static double addValue (String ... values)
	{
		double result = 0;
		
		for (String value :values)
		{
			double d = Double.parseDouble(value);
			result +=d;
		}
		return result;
		
	}

}
