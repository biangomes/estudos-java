package udemy.exerciciopraticoSongList;

import java.util.Objects;

public class Musica {
    private String nome;
    private int duracao;        // em segundos

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDuracao(int duracao) {
        this.duracao=duracao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return duracao == musica.duracao && Objects.equals(nome, musica.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }
}
