package TratamentoDeErro;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}
	
	// Exceção Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("ocorreu um erro bem legal #01");
	}
	
	//Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("ocorreu um erro bem legal #0");
	}
}
