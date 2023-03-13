package RinaldoDev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamParte2 {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3);
		
		//Operações finais com Stream
		//*Quando é chamado uma operação final, não tem como chamar ele de novo 
		
		// Operações finais: count, min/max, collect (toList, groupingBy e joining)
 
		String collect = lista.stream()
		.map(e -> String.valueOf(e))
		.collect(Collectors.joining(";")); //--> quantos elementos tem no stream
		
		System.out.println(collect);
		
		
		
		
	}
}
