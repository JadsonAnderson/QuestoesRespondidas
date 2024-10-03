package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        calcularFibonacci(numero);
        
        if (existeNumero(numero))
            System.out.println("O número informado está na lista");
        else
            System.out.println("O número informado não está na lista");

        scanner.close();

    }

    public static int calcularFibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

    public static boolean existeNumero(int numero) {
        ArrayList<Integer> lista = new ArrayList<>();
        int a = 0;
        int b = 1;
        while (a <= numero) {
            lista.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        return lista.contains(numero);        
    }

}
