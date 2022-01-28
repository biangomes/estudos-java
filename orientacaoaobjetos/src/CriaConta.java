public class CriaConta {
    public static void main(String[] args) {

        // instância de uma classe, o que o torna "palpável" é a palavra: new.
        Conta primeiraConta = new Conta();        // Cria um objeto do tipo Conta.
        // Conta : tipo de dado
        // primeiraConta : nome da variável que instancia a classe Conta, que, tecnicamente, APONTA para um objeto da classe
        // new : keyword do Java que, de fato, instancia a classe.
        // Conta() : a classe que está sendo instanciada
        primeiraConta.saldo = 200;      // atribuindo 200 ao atributo saldo.
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 1000;
        System.out.println(primeiraConta.saldo);
        // primeiraConta, na realidade, é uma REFERÊNCIA ao objeto


        // Criando outra referência
    }
}
