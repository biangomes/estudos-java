package br.com.caelum.ed;

public class TesteContemAluno {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Paulo");
		a2.setNome("Nilmara");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));
		
		lista.contem(a1);
		lista.contem(a2);
	}
}
