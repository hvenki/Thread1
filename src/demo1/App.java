package demo1;

//using thread class run() method
class Runner extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Hello" +i);
			
			//sleep frozes the program for certain milliseconds
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
public class App {

	public static void main(String[] args) {
		

		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();

	}

}
