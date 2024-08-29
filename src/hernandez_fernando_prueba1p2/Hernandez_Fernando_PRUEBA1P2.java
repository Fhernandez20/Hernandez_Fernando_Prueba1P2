/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_prueba1p2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Hernandez_Fernando_PRUEBA1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = 0;
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        String palabras[] = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};

        for (int contador = 0; contador < palabras.length; contador++) {
            System.out.println("[" + contador + "]: " + palabras[contador]);
        }

        do {
            System.out.println("");
            System.out.println("Favor ingrese el tamaño del arreglo que desea: ");
            tamano = lea.nextInt();

            if (tamano < 0) {
                System.out.println("ingrese un valor tamaño valido");
            }

        } while (tamano < 0 || tamano > 20);

        String[] palindromoA = new String[tamano];
        String[] palindromoB = new String[tamano];
        int contadorPalindromo = 0;
        //Arreglo A//

        while (contadorPalindromo < tamano) {
            int numeroRandom = random.nextInt(20);
            String palabraEvaluar = palabras[numeroRandom];
            String palabraInversa = "";
            for (int contadorLetra = palabraEvaluar.length() - 1; contadorLetra >= 0; contadorLetra--) {
                palabraInversa += palabraEvaluar.charAt(contadorLetra);
            }
            if (palabraEvaluar.equals(palabraInversa)) {
                palindromoA[contadorPalindromo] = palabraEvaluar;
                contadorPalindromo++;
            }
        }

        System.out.println("Lista Arreglo A palindroma");
        for (int contador = 0; contador < palindromoA.length; contador++) {
            System.out.println("[" + contador + "]: " + palindromoA[contador]);
        }

        contadorPalindromo = 0;

        //Arreglo B//
        while (contadorPalindromo < tamano) {

            int numeroRandom = random.nextInt(20);
            String palabraEvaluar = palabras[numeroRandom];
            String palabraInversa = "";
            for (int contadorLetra = palabraEvaluar.length() - 1; contadorLetra >= 0; contadorLetra--) {
                palabraInversa += palabraEvaluar.charAt(contadorLetra);
            }
            if (palabraEvaluar.equals(palabraInversa)) {
                palindromoB[contadorPalindromo] = palabraEvaluar;
                contadorPalindromo++;
            }
        }
        System.out.println("Lista Arreglo B palindroma");
        for (int contador = 0; contador < palindromoB.length; contador++) {
            System.out.println("[" + contador + "]: " + palindromoB[contador]);
        }

    }
}


