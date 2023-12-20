package oops;

abstract public class Demo 
{
	abstract void t1();
	abstract void t2();
	abstract void t3();
	abstract void t4();
	
}
class Test extends Demo
{
	@Override
	void t1()
	{
		System.out.println(" in test class");
	}

	@Override
	void t2() {
		// TODO Auto-generated method stub
		System.out.println(" in test class");
	}

	@Override
	void t3() {
		// TODO Auto-generated method stub
		System.out.println(" in test class");
	}

	@Override
	void t4() {
		// TODO Auto-generated method stub
		System.out.println(" in test class");
	}
}
