package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, media = 0, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, contador = 0, soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if ((numero >= 0) && (numero <= 100)) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                soma += numero;
                contador++;
            } else {
                System.out.println("Número " + numero + " fora da faixa de 0 a 100.");
            }

        } while ((numero >= 0) && (numero <= 100));

        if (contador > 0) {
            media = soma / contador;
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);
        System.out.println("\nA média é:" + media);
        entrada.close();
    }
}
