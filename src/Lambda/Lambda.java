package Lambda;

public class Lambda {
	public static void main(String[] args) {
		System.out.println("Inicio do teste");
		
		//implementação da classe anonima
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Estudando a expressão lambda 1");
				
			}
		};
		
		Runnable r2;
		r2 = ()  //lista de argumentos
				-> //Seta (é o que diz estar trabalhando com lambda)
				System.out.println("Estudando a expressão lambda 2");//corpo
		
		r1.run();
		r2.run();
	}
}
