package TratamentoDeErro.personalizadaA;

import TratamentoDeErro.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
