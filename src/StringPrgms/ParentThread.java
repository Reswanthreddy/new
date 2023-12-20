package StringPrgms;

public class ParentThread extends Thread {
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("child thread");
		}
	}
}
class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentThread p1 = new ParentThread();
		p1.start();
		for(int i=1;i<=5;i++) {
			System.out.println("parent thread");
		}
	}
}
