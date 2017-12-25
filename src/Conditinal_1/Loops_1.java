package Conditinal_1;

public class Loops_1 {

	public static void main(String[] args) 
	{
	  String [] mounths= { "jan","Fab", "March", "April","May","June","July","Aug","September", "Oct","Nov", "Dec"};
	  
//incremental loop
// 	   for (int i = 0; i<mounths.length; i++)
//	   {
//		   System.out.println(mounths[i]);
//		   
//	   }
	//incremental loop in reverse 
//	   for (int i = mounths.length-1; i>=0; i--)
//	   {
//		   System.out.println(mounths[i]);
//		   
//	   }
	  
	  // For each loop
	  
//	  for(String mounth :mounths)
//	  {
//		  System.out.println(mounth);
//		  
//		  
//	  }
	// while loop
	  
//	  int counter =0;
//	  while (counter < mounths.length)
//	  {
//		  System.out.println(mounths[counter]);
//		  counter++;
//		  
//		
//	  }
	  
	  // Do while loop
	  int counter =0;
 	  do {
		  System.out.println(mounths[counter]);
 		  counter++;
	     }
	  while (counter < mounths.length);
 	  

}
}