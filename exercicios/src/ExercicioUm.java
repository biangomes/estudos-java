import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {

        /* Questão 1
        A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
        dimensões de um terreno e depois exibir a área do terreno.*/

        Scanner input = new Scanner(System.in);
        double largura;
        double comprimento;

        System.out.println("Largura (cm): ");
        largura = Double.parseDouble(input.nextLine());     // Recebe como String e converte para double

        System.out.println("Comprimento (cm): ");
        comprimento = Double.parseDouble(input.nextLine());

        System.out.println("A área é de " + largura*comprimento + "cm².");
    }
}
