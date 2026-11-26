import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 01: "Adivina un número: Dada la dinámica de juego computacional,
 * programar una solución que genere un número entero aleatorio entre 1-N, y
 * solicite al usuario lo adivine; dé pistas si es que el usuario falla,
 * advirtiendo la cantidad de intentos restantes. Si es que no logra adivinar,
 * muestre el mensaje "GAME OVER"."
 * @author Jostyn Saquisari
 * @version 1.0
 */
public class Ejercicio1_AdivinaNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numAdv = 0, intentos = 1;
        System.out.print("Pienso en Num (0-20), adivina: ");
        while (intentos <= 3) {
            numAdv = tcl.nextInt();
            if (numAdv == numAle) {
                System.out.println("BIEN, ADIVINTASE EN: " +intentos);
                break;
            } 
            else 
                if (numAle > numAdv)
                    System.out.println("MAL, es mayor!!!" );
            else
                System.out.println("MAL, es menor!!!");
            intentos++;
            if (intentos ==1)
                System.out.println("Mal te quedan 3 intentos;");
            if (intentos ==2)
                System.out.println("Mal te queda 2 intentos;");
            if (intentos ==3)
                System.out.println("Mal te queda 1 intento;");
            }
        if(numAdv != numAle)
            System.out.println("GAME OVER");
        }
    }
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */