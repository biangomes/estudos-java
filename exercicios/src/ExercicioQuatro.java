import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
        ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
        com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
        DIAS
         */
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Nome: ");
        nome = input.nextLine();
        System.out.println("Idade: ");
        idade = Integer.parseInt(input.nextLine());

        String frase = "você já viveu " + idade * 365 + " dias.";
        System.out.println(nome.toUpperCase() + ", " + frase.toUpperCase());
        //int dias_de_vida = idade * 365;
    }
}
