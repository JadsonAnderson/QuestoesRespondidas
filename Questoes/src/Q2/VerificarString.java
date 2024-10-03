package Q2;

import java.util.Scanner;

public class VerificarString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um texto: ");
        String texto = scanner.nextLine();

        int quantidade = 0;
        boolean letraEncontrada = false;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                quantidade++;
                letraEncontrada = true;
            }
        }

        if (letraEncontrada) {
            System.out.println("A letra 'a' existe no texto.");
        } else {
            System.out.println("A letra 'a' não existe no texto.");
        }

        System.out.println("Quantidade de vezes em que ocorre a letra a no texto: " + quantidade);

        scanner.close();

    }

}
