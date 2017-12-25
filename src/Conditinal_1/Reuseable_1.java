package Conditinal_1;

public class Reuseable_1
{
	static String [] mounths= { "jan","Fab", "March", "April","May","June","July","Aug","September", "Oct","Nov", "Dec"};
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		 loopit("Mount of the year");
		 loopit("Seconed run");
		 loopit("thtrd time");
	}

	static void loopit(String label) 
	{
		System.out.println(label);
		for (int i = 0; i<label.length(); i++)
		{
			System.out.print("*");
		}
		
		System.out.println(" ");
		
		for (int i = 0; i<mounths.length; i++)
		   {
			   System.out.println(mounths[i]);
			   
		   }
	}
}
