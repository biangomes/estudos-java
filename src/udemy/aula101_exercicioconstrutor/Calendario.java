package udemy.aula101_exercicioconstrutor;

public class Calendario {
    String dia;
    String mes;
    String ano;

    Calendario() {
        dia = "01";
        mes = "01";
        ano = "1970";
    }

    Calendario(String diaNovo, String mesNovo, String anoNovo) {
        dia = diaNovo;
        mes = mesNovo;
        ano = anoNovo;
    }
}
