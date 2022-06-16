import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        /*
        A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a
        cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber
        quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de
        poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com
        base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular
        os dados solicitados.
         */
        Scanner input = new Scanner(System.in);

        double preco_pao = 0.12; double preco_broa = 1.50;
        int qtd_pao; int qtd_broa;

        System.out.println("Quantidade de pão: ");
        qtd_pao = Integer.parseInt(input.nextLine());
        System.out.println("Quantidade de broa: ");
        qtd_broa = Integer.parseInt(input.nextLine());

        double arrecadacao = (qtd_pao*preco_pao) + (preco_broa*qtd_broa);
        double poupanca = 0.10*(arrecadacao);

        System.out.println("Arrecadou R$" + arrecadacao);
        System.out.print("Guardou R$" + poupanca);

    }
}
