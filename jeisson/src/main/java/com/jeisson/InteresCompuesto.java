package com.jeisson;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el monto inicial de inversión: ");
        double capital = scanner.nextDouble();
        
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasa = scanner.nextDouble() / 100;
        
        System.out.print("Ingrese el número de años: ");
        int años = scanner.nextInt();
        
        System.out.print("Ingrese la frecuencia de capitalización (1-Mensual, 2-Trimestral, 3-Semestral, 4-Anual): ");
        int opcion = scanner.nextInt();
        int n = switch (opcion) {
            case 1 -> 12;
            case 2 -> 4;
            case 3 -> 2;
            default -> 1;
        };
        
        System.out.println("Año | Capital Inicial | Interés Ganado | Saldo Final");
        for (int i = 1; i <= años; i++) {
            double interes = capital * Math.pow(1 + (tasa / n), n * i) - capital;
            double saldoFinal = capital + interes;
            System.out.printf("%d | %.2f | %.2f | %.2f\n", i, capital, interes, saldoFinal);
        }
        
        scanner.close();
    }

}
