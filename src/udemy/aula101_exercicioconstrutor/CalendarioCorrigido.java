package udemy.aula101_exercicioconstrutor;

public class CalendarioCorrigido {
    int dia;
    int mes;
    int ano;

    CalendarioCorrigido() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    CalendarioCorrigido(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}
