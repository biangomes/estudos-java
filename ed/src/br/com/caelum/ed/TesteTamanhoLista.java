package br.com.caelum.ed;

public class TesteTamanhoLista {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Ana");
		a2.setNome("Flávia");
		a3.setNome("Brooksenzo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());
	}
}
