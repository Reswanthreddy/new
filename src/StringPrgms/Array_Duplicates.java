package StringPrgms;

public class Array_Duplicates {

	public static void main(String[] args) 
	{
		int a[] = {1,2,5,7,10,8,4,2,6};
		int b[]=new int[a.length];
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					b[i]=1;
					b[j]=1;
				}
			}
		}
		for(int i:b)
		{
			System.out.print(i+" ");
		}
	}
}
