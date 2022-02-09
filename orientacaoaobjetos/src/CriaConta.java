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


        // Criando outras referências
        Conta contaAnaFlavia = new Conta();
        Conta contaBeatriz = new Conta();
        Conta contaRose = new Conta();

        // Adicionando valores ao objeto contaAnaFlavia
        contaAnaFlavia.saldo = 40.00; contaAnaFlavia.agencia = 0001; contaAnaFlavia.numero = 123;
        contaAnaFlavia.titular = "Ana Flávia Carvalho da Silva";

        // Adicionando valores ao objeto contaBeatriz
        contaBeatriz.saldo = 161.00; contaBeatriz.agencia = 0001; contaBeatriz.numero = 345;
        contaBeatriz.titular = "Beatriz Nascimento Gomes";

        // Adicionando valores ao objeto contaRose
        contaRose.saldo = 2000.00; contaRose.agencia = 1001; contaRose.numero = 0664;
        contaRose.titular = "Maria Rozilda";


        // Acessando os objetos
        System.out.println("SALDO\n Ana Flávia: "
                + contaAnaFlavia.saldo + "\n"
                + "Beatriz: "
                + contaBeatriz.saldo + "\n"
                + "Rose: " + contaRose.saldo);
    }
}
