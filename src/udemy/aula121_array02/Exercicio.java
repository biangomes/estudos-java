package udemy.aula121_array02;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 4.0;
        notasAlunoA[1] = 9.0;
        notasAlunoA[2] = 10.0;

        System.out.println(Arrays.toString(notasAlunoA));


        int[] dobro = new int[3];

        for(int j=0; j<dobro.length; j++) {
            dobro[j] = 2 * j;
        }
        System.out.println(Arrays.toString(dobro));
    }
}
