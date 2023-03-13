package RinaldoDev;

public class Java8LambdaRunnable {
	public static void main(String[] args) {
		//Java 8: Funções Lambda
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Olá mundo!");
				
			}
		}).run();
		
		new Thread(() -> System.out.println("Olá mundo!")).run();		
		
	}
}
