package com.lordgabriel.resulmult.inicio;

import Objetos.Numeros;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PraticaMultiplicacao {
    public static void main(String[] args) {
        String sN = "";
        Numeros numeros = new Numeros();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();
        int resposta;
        int numeroAleatorio;
        int min = 1;
        int max = 100;

        System.out.println("Qual tabuada você quer?");
        numeros.tabuada = scanner.nextInt();
        numeroAleatorio = random.nextInt((max - min) + 1) + min;
        do {
            System.out.printf(String.format("%d x %d:", numeros.tabuada, numeroAleatorio));
            resposta = scanner.nextInt();
            scanner.nextLine();
            if (resposta != numeros.tabuada * numeroAleatorio) {
                System.out.println("Você errou! tente novamente!");
            } else {
                System.out.println("Parabens, você acertou!!! quer continuar?[S|N]");
                numeroAleatorio = random.nextInt((max - min) + 1) + min;
                sN = scanner.nextLine();
            }
        } while (!sN.equalsIgnoreCase("n") || !sN.equalsIgnoreCase("N"));
    }
}