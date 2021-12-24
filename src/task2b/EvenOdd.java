package task2b;

public class EvenOdd {
	
	public static void main(String args[])
	{
		Printer oddObj=new Printer(1);
		Printer evenObj=new Printer(0);
		
		Thread odd=new Thread(oddObj,"Odd Thread");
		Thread even=new Thread(evenObj,"Even Thread");
		
		even.start();
		odd.start();
		
		
	}

}
