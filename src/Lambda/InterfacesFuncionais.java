package Lambda;

public class InterfacesFuncionais {
	
	interface Num{
		double getValue();
	}
	
	interface ValorNumerico{
		boolean teste(int n);
	}
	
	interface ValorNumerico2{
		boolean teste(int n, int n2);
	}
	
	public static void main(String[] args) {
		
		//Expressão lambda utilizada como uma constante
		Num n;
		n = () -> 333.11;
		
		System.out.println(n.getValue());
		
		//Utilizando da classe math com a estrutura lambda
		Num n2 = () -> Math.random() * 100;
		
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
		
		ValorNumerico isPar = (int i) -> (i % 2) == 0;
		
		System.out.println(isPar.teste(89));
		System.out.println(isPar.teste(90));
		
		
		ValorNumerico2 isDiv = (x, y) -> (x % y) == 0; 
		System.out.println(isDiv.teste(10, 2));
		System.out.println(isDiv.teste(10, 3));
		
		ValorNumerico expressao1 = (i) -> (i % 2) == 0;
		ValorNumerico2 expressao2 = (x, y) -> {
			int w = x + y;
			return w > 1000;
		};
		
	}
}
