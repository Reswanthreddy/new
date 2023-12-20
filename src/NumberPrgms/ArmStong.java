package NumberPrgms;

import java.util.Scanner;

public class ArmStong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int b=a;
		int c =b;
		int rem;
		
		int count=0;
		
		 while(a>0)
		 {
			 count++;
			 a/=10;
		 }
		 int sum =0;
		 while(b>0)
		 {
		 int fact=1;
		 rem=b%10;
		 for(int i =1;i<=count;i++)
		 {
			 fact=fact*rem;
		 }
		 sum=sum+fact;
		 b/=10;
		 }
		 if(sum==c)
		 {
			 System.out.println(c+" is a armstrong number");
		 }
		 else
			 System.out.println(c+" is  not a armstrong number");
		 
		

	}

}
