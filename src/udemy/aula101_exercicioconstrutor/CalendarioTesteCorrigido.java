package udemy.aula101_exercicioconstrutor;

public class CalendarioTesteCorrigido {
    public static void main(String[] args) {

        CalendarioCorrigido cc1 = new CalendarioCorrigido();

        var cc2 = new CalendarioCorrigido(1, 6, 2019);

        String dataFormatada1 = cc1.obterDataFormatada();

//        System.out.println(dataFormatada1);
//        System.out.println(cc2.obterDataFormatada());

        cc1.imprimirDataFormatada();
        cc2.imprimirDataFormatada();
    }
}
