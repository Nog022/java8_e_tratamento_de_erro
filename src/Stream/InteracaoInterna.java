package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class InteracaoInterna {
	public static <String> void filtro(List<String> lista, Predicate<String> condicao) {
		//for(String s: lista)
			//if(condicao.test((String) s))
				//System.out.println(s);
		
		//lista.stream().filter((str) -> condicao.test(str)).forEach((str) -> System.out.println(str));
		lista.stream().filter(condicao::test).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		List<String> lista1 = Arrays.asList("Santa Catarina",
				"Parana",
				"São Paulo",
				"Rio de Janeiro",
				"Brasileia",
				"Ceara");
		
		System.out.println("Estados que iniciam com a letra S");
		filtro(lista1, (s) -> s.startsWith("S"));
		
		System.out.println("");
		
		System.out.println("Estados que finalizam com a letra A");
		filtro(lista1, (s) -> s.endsWith("a"));
		
		System.out.println("");
		
		System.out.println("Imprime toda lista");
		filtro(lista1, (s) -> true);
		
		System.out.println("");
		
		System.out.println("Não imprime toda lista");
		filtro(lista1, (s) -> false);
		
		System.out.println("");
		
		System.out.println("Imprime os nomes com + de 10 caracteres");
		filtro(lista1, (s) -> s.length() > 10);
		
	}
}
