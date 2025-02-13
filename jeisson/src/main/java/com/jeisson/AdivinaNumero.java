package com.jeisson;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("Adivina el número (entre 1 y 100):");

        do {
            System.out.print("Introduce un número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            }
        } while (intento != numeroSecreto);

        System.out.println("¡Correcto! El número era " + numeroSecreto);
        scanner.close();
    }
}
