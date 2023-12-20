package NumberPrgms;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value ");
		int a = sc.nextInt();
		int sum = 0;
		int b =a;
		while(a>0)
		{
			int rem =a%10;
			sum=sum*10+rem;
			a/=10;
			
		}
		if(sum==b)
		{
			System.out.println("it is a Palindrome number ");
		}
		else
			System.out.println("it is not a Palindrome number ");
		

	}

}
