package com.jeisson;

import java.util.Scanner;

public class Subcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String s = scanner.nextLine();
        
        System.out.print("Ingrese el índice de inicio y fin separados por espacio: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        System.out.println("Subcadena: " + s.substring(start, end));
        
        scanner.close();
    }


}
