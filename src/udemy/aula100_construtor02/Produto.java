package udemy.aula100_construtor02;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // Definicao explícita do construtor padrão
    Produto () {

    }

    Produto(String nomeInicial) {
        //this.nome = nomeInicial;
        nome = nomeInicial;
    }

    Produto(String nomeInicial, Double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // Método regular
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    // Método regular
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
