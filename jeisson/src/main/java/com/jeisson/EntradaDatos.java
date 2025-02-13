package com.jeisson;

import java.util.Scanner;

public class EntradaDatos {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        scanner.close();
    }


}
