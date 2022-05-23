package udemy.aula130_set02;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

//      Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovadosOrdenada = new TreeSet<String>();


//        listaAprovados.add("Beatriz");
//        listaAprovados.add("Ana");
//        listaAprovados.add("Bea");
//        listaAprovados.add("Aninha");
//
//        for (String candidato: listaAprovados) {
//            System.out.println(candidato);
//        }

        listaAprovadosOrdenada.add("Beatriz");
        listaAprovadosOrdenada.add("Cris");
        listaAprovadosOrdenada.add("Ana");

        for (String candidatoOrdenado: listaAprovadosOrdenada) {
            System.out.println(candidatoOrdenado);
        }

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(1);
        nums.add(4);
        nums.add(7);

        for (int n: nums) {
            System.out.print(n);
        }
    }
}
