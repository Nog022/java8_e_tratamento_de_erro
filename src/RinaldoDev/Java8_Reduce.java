package RinaldoDev;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8_Reduce {
	public static void main(String[] args) {
		String s = "Coisas da vidaaaaaa";
		String[] split = s.split(" ");
		List<String> listStr = Arrays.asList(split);
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6);
		
		//reduce: pegar os elementos juntar eles e transforma-los
		
		
		//reduce - soma
		
		Optional<Integer> soma = list.stream()
		.reduce((n1, n2) -> n1 + n2);
		System.out.println(soma.get());
		
		
		
		//reduce - multiplicação
		
		Optional<Integer> multiplicacao = list.stream()
		.reduce((n1, n2) -> n1 * n2);
		System.out.println(multiplicacao.get());
		
		
		//reduce - concatenação
		
		Optional<String> concatenacao = listStr.stream()
		.reduce((s1, s2) -> s1.concat(s2));
		System.out.println(concatenacao.get());
		
		
		//reduce - subtração
		
		Optional<Integer> subtracao = list.stream()
		.reduce((n1, n2) -> n1 + n2);
		System.out.println(subtracao.get());
		
		
	}
}
