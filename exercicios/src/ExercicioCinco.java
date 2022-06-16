import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        /*
        Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
        preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
        tanque.
         */
        Scanner input = new Scanner(System.in);

        double preco_gasolina; double valor_pagamento;

        System.out.println("Preço da gasolina R$ ");
        preco_gasolina = Double.parseDouble(input.nextLine());
        System.out.println("Valor do pagamento R$ ");
        valor_pagamento = Double.parseDouble(input.nextLine());
        double qtd_litro = valor_pagamento / preco_gasolina;
        System.out.println("Você colocou " + qtd_litro);
    }
}
