package com.jeisson;

import java.util.Scanner;

public class Amortizacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double monto = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Ingrese el plazo del préstamo (en años): ");
        int plazo = scanner.nextInt();

        int meses = plazo * 12;
        double tasaMensual = (tasaAnual / 100) / 12;
        double cuotaMensual = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -meses));

        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "Mes", "Saldo Inicial", "Cuota", "Interés", "Capital", "Saldo Pendiente");

        double saldo = monto;
        for (int i = 1; i <= meses; i++) {
            double interes = saldo * tasaMensual;
            double capital = cuotaMensual - interes;
            saldo -= capital;

            System.out.printf("%-10d%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", i, monto, cuotaMensual, interes, capital, saldo);
            monto = saldo;
        }

        scanner.close();
    }


}
