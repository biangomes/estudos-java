import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        /* Questão 2
        Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os
        cavalos comprados para um haras.
         */

        Scanner input = new Scanner(System.in);

        int qtd_cavalos;

        System.out.println("Quantidade de cavalos: ");
        qtd_cavalos = Integer.parseInt(input.nextLine());

        System.out.println("São necessárias " + qtd_cavalos*4 + " ferraduras.");

    }
}
