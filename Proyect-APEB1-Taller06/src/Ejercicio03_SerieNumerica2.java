import java.util.Scanner;
/**
 * Ejercicio 03: "Serie numérica 2: Realizar un programa Java que permita 
 * presentar en pantalla la siguiente secuencia: 5/10  10/12  15/14  20/16 25/18
 * 30/20
 * @author Jostyn Saquisari
 * @version 1.0
 */
public class Ejercicio03_SerieNumerica2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numd=5, denomi = 10;
        for (int i = 1; i <= 6; i++) {
            System.out.println(numd + "/" + denomi);
        numd += 5;
        denomi +=2;
        }
    }
    }
    /**
     * *
     * EVIDENCIA DEL RUN: Pegue aquí la evidencia de la ejecución del .java
     */