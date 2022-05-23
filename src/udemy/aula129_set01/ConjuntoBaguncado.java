package udemy.aula129_set01;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();


        /*Lembrando que a interface Set (implementada aqui pela classe HashSet) não aceita tipos primitivos
        Porém, quando utilizamos o método add(), o parâmetro dele será instanciado pela classe do tipo primitivo.
        Este é o conceito de wrapper.
        Obs.: o conceito acima pode estar equivocado, pois ainda não vi wrapper, apenas o que é.*/
        conjunto.add(1.2);  // double   -> Double
        conjunto.add(true); // boolean  -> Boolean
        conjunto.add("Beatriz");    // string   -> Nao precisa converter pois ja eh objeto
        conjunto.add(1);    // int  -> Integer
        conjunto.add('x');  // char -> Caracter


        // Saber o tamanho do conjunto
        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add(1);    // continua com tamanho = 5, pq eh um elemento repetio


        // Removendo um elemento
        System.out.println(conjunto.remove("Beatriz"));

        // Verificando se o elemento "Beatriz" está contido no conjunto
        System.out.println("O elemento ainda está no conjunto? R.: " + conjunto.contains("Beatriz"));
        System.out.println("O elemento ainda está no conjunto? R.: " + conjunto.contains(1.2));
        System.out.println("O novo tamanho é: " + conjunto.size());

        // Novo HashSet
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // Exibindo no console
        System.out.println(nums);
        System.out.println(conjunto);

        // Uniao entre conjunto e nums
        //conjunto.addAll(nums);

        // Intersecçao entre conjunto e nums
        conjunto.retainAll(nums);
        System.out.println("conjunto E nums = " + conjunto);

        // Limpa o conjunto
        conjunto.clear();
        System.out.println(conjunto);
    }
}
