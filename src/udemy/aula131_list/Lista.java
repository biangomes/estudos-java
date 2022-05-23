package udemy.aula131_list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Bia");
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Arthur"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Manu"));


        // Acessando um elemento específico
        System.out.println(lista.get(3).nome);
        System.out.println(lista.get(1));
        System.out.println("\n");

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
