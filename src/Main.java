import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tablica = new double[5];
        tablica[0] = 1.4;
        tablica[1] = 3.1;
        tablica[2] = 5.4;
        tablica[3] = 3.5;
        tablica[4] = 2.4;

        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);

    }
}
