package Conditinal_1;

import java.util.Scanner;

public class Cond2 {

	public static void main(String[] args) 
	{
		 Scanner sc =new Scanner (System.in);
		 System.out.println("Enter a number");
		 String input = sc.nextLine();
		 int mothNUmber = Integer.parseInt(input);
		 
		switch (mothNUmber)
		{
		case 1:
			System.out.println("the mounth is january");
			break;
		case 2:
			System.out.println("the mounth is fab");
			break;
		case 3:
			System.out.println("the mounth is march");
			break;
			default:
				System.out.println("You choose anothe mounth");
				 
				
		}
	}

}
