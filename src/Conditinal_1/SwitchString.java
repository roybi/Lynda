package Conditinal_1;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) 
	{
		 Scanner sc =new Scanner (System.in);
		 System.out.println("Enter a String");
		 String input = sc.nextLine();
		 
		 
		switch (input)
		{
		case "Jan":
			System.out.println("the mounth is january");
			break;
		case "Fab":
			System.out.println("the mounth is fab");
			break;
		case "Mar":
			System.out.println("the mounth is march");
			break;
			default:
				System.out.println("You choose anothe mounth");
				 
				
		}
	}

}
