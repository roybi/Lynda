package Conditinal_1;

public class Cond_1 {

	public static void main(String[] args) 
	{
		int monthNumber =13;
		
		if (monthNumber>=1 && monthNumber <=3)
		{
			System.out.println("you are in quater 1");
			
		}
		else if (monthNumber>=4 && monthNumber <=6)
		{
			System.out.println("you are in quater 2");
			
		}
		else if (monthNumber>=7 && monthNumber <=9)
		{
			System.out.println("you are in quater 3");
			
		}
		else if (monthNumber>=10 && monthNumber <=12)
		{
			System.out.println("you are in quater 4");
			
		}
		else
		{
			System.out.println("ythis is unknow mounth");
		}
		

	}

}
