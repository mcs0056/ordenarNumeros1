package ejercicio1;

import java.util.*;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        // Leer todos los números desde stdin
        while (sc.hasNextInt()) {
            numeros.add(sc.nextInt());
        }

        // Ordenar
        Collections.sort(numeros);

        // Mostrar resultado
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}