package udemy.aula120_array01;

import java.lang.reflect.Array;

public class Baralho {

    int[] ordem_cartas = new int[11];

    public int[] setOrdemCartas() {
        for(int i=0; i< ordem_cartas.length; i++) {
            ordem_cartas[i] = i+1;      // 0 - numero 4; 10 - valete; 11 - rei
        }
        return ordem_cartas;
    }

}
