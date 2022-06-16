package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

	// Declarando e Inicializando um array de Aluno com capacidade 100
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	
	public void adiciona(Aluno aluno) {
		
/*		for (int i=0; i<this.alunos.length; i++) {
			// Encontra o fim da lista
			if (this.alunos[i] == null) {
				// Adiciona o aluno no fim da lista
				this.alunos[i] = aluno;
				break;
*/
			
		// Testando outro método
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		
	}
	
	public Aluno pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		return false;
	}
	
	public int tamanho() {
		return 0;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
}
