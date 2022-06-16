package br.com.caelum.ed;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Ana");
		a2.setNome("Beatriz");
		a3.setNome("Rose");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(0, a1);
		lista.adiciona(1, a2);
		lista.adiciona(2, a3);
		
		System.out.println(lista);
	}

}
