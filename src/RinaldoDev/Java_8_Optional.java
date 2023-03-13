package RinaldoDev;

import java.util.Optional;
import java.util.stream.Stream;

public class Java_8_Optional {
	public static void main(String[] args) {
		/*
		//String s = "Coisas da vida";
		String s = "1";
		
		Integer numero = converteEmNumero(s)
		.orElseThrow(() -> new NullPointerException("Valor Vazio"));
		System.out.println(numero);
		*/
		
		Stream.of( 2,3).findFirst()
		.ifPresent(n -> System.out.println(n));
	}
	
	public static Optional<Integer> converteEmNumero(String numeroStr){
		
		try {
			Integer integer = Integer.valueOf(numeroStr);
			return Optional.of(integer);
		} catch (Exception e) {
			return  Optional.empty();
		}
		
		
		
		
	}
}
