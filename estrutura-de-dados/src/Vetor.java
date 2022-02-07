import java.util.Arrays;

public class Vetor {

    // Criando array chamado alunos
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    // Adiciona aluno no array
    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    // "Guarda" a posição do aluno
    public Aluno pega(int posicao) {
        return null;
    }

    // Remove aluno dado aquela posição
    public void remove(int posicao) {

    }

    public boolean contem(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++) {
            if(aluno.equals(alunos[i])) {
                return true;
            }
        }

        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}