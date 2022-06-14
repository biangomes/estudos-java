package udemy.aula120_array01;

import java.lang.reflect.Array;

public class Baralho {

    int[] ordem_cartas = new int[11];
    String[] naipe = new String[5];
    int vira;
    int manilha;

    public int[] setOrdemCartas() {
        for(int i=0; i< ordem_cartas.length; i++) {
            ordem_cartas[i] = i+1;      // 0 - numero 4; 10 - valete; 11 - rei
        }
        return ordem_cartas;
    }

    public String[] setNaipe() {
        naipe[0] = "ouro";
        naipe[1] = "espada";
        naipe[2] = "copas";
        naipe[3] = "paus";

        return naipe;
    }

}
