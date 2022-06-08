package udemy.exerciciopraticoEqualsHashcod;

public class App {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.setNome("Mouse");
        p1.setPreco(396.06);

        p2.setNome("Processador AMD Ryzen 5600G");
        p2.setPreco(2500.00);

        p3.setNome("Mouse");
        p3.setPreco(396.06);

        // p1 é igual a p2?
        System.out.println("p1 é igual a p2? " + p1.equals(p2));
        System.out.println("p1 é igual a p3? " + p1.equals(p3));
    }
}
