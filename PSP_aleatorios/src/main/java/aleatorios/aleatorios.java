package aleatorios;

import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random r = new Random();

        for(int i=0; i<40; i++){
            int numero = r.nextInt(101);
            System.out.println(numero);
        }
    }
}
