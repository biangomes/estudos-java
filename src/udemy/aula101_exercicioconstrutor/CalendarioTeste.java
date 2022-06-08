package udemy.aula101_exercicioconstrutor;

public class CalendarioTeste {
    public static void main(String[] args) {

        Calendario c1 = new Calendario();
        Calendario c2 = new Calendario("07", "07", "1998");

        System.out.println("Calendário padrão: " + c1.dia + "/" + c1.mes + "/" + c1.ano);
        System.out.println("Calendário Novo: " + c2.dia + "/" + c2.mes + "/" + c2.ano);
    }
}
