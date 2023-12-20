package oops;

class runtime 
{
	public void display()
	{
		System.out.println("in parent class");
		
	}

}
class Reshu extends runtime
{
	@Override
	public void display()
	{
		System.out.println("in child class");
	}
	
	
}
class main
{
	public static void main(String[]args)
	{
		runtime rt = new Reshu();
		Reshu t= (Reshu)rt;
		t.display();
		rt.display();
	}
}
