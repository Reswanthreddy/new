package NumberPrgms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);	
	  System.out.println("Enter the number ");
	  int a = sc.nextInt();
	  int c =a;
	  boolean flag = true;
	  int sum = 0;
	  
	  while(a>0)
	  {
		  int fact = 1;
		  int rem = a%10;
		  int b = rem;
		  for (int i=b;i>0;i--)
		  {
			  fact=fact*i;
		  }
		  sum = sum+fact;
		  a/=10;
		  
	  }
	  if(sum==c)
	  {
		  System.out.println(c+" is a strong number");
	  }
	  else
		  System.out.println(c+ "  is not a strong number");
	}

}
