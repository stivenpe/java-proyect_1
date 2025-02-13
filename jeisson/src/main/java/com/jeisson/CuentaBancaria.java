package com.jeisson;

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el saldo inicial de la cuenta: ");

        double saldo = scanner.nextDouble();
        
        System.out.print("Ingrese el depósito mensual fijo: ");
        double deposito = scanner.nextDouble();
        
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble();
        double tasaMensual = (tasaAnual / 100) / 12;
        
        System.out.print("Ingrese el número de meses de simulación: ");
        int meses = scanner.nextInt();
        
        System.out.println("Mes | Saldo Inicial | Depósito | Interés | Saldo Final");
        for (int i = 1; i <= meses; i++) {
            double interes = saldo * tasaMensual;
            double saldoFinal = saldo + deposito + interes;
            System.out.printf("%d | %.2f | %.2f | %.2f | %.2f\n", i, saldo, deposito, interes, saldoFinal);
            saldo = saldoFinal;
        }
        
        scanner.close();
    }


}
