package RinaldoDev;

import java.util.Arrays;
import java.util.List;

public class StreamParte1 {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
		
		//Java 8: Streams
		//lista.stream().forEach(e -> System.out.println(e));  --> UTILIZANDO STREAM COM FOREACHE
		
		/*
		lista.stream()
			.skip(2) --> pula os primeiros dois elementos do array    //operação intermediria
			.forEach(e -> System.out.println(e));
			
			lista.stream()
			.limit(2) //diz quando elementos que vai ser processado
			.forEach(e -> System.out.println(e));
			
			lista.stream()
			.distinct() // não permite que processe os elementos repetidos é tipo o equelas e o hashcode
			.forEach(e -> System.out.println(e));
			
			
			*use os filtros e as coisas que vão organizar ou limita. e Depois use o que vai ser tranformado no que vai ser usado
		*/
		
		lista.stream()
		.map(e -> e * 2)
		.forEach(e -> System.out.println(e));
		
	}
}
