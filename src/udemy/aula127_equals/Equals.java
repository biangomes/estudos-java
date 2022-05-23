package udemy.aula127_equals;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Ana Silva";
        u1.email = "anafcarvalhos@gmail.com";
        u2.nome = "Ana Silva";
        u2.email = "anafcarvalhos@gmail.com";

        System.out.println(u1 == u2);       // false
        System.out.println(u1.equals(u2));      // false
        System.out.println(u2.equals(u1));      // false
        System.out.println(u2.equals(new Date()));

        /*
        System.out.println(u2.equals(new Date()));

            Exception in thread "main" java.lang.ClassCastException: class java.util.Date cannot be cast to class udemy.aula127_equals.Usuario (java.util.Date is in module java.base of loader 'bootstrap'; udemy.aula127_equals.Usuario is in unnamed module of loader 'app')
            at udemy.aula127_equals.Usuario.equals(Usuario.java:10)
            at udemy.aula127_equals.EqualsHashcode.main(EqualsHashcode.java:20)

         */
        //System.out.println(u1.equals(u1));    true
        //System.out.println(u2.equals(u2));    true
    }
}
