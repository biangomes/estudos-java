package udemy.aula100_construtor02;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;


        var p2 = new Produto("Caneta preta");
        //p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);


        double precoFinal = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal + precoFinal2) / 2;


        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}