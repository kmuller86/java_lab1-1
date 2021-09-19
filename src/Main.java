import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        double liczba = 23.534;
        System.out.println("znak char = " + liczba);
        boolean bul = true;
        System.out.println(bul);
        float plaska = 232132;
        System.out.println(plaska);
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        //a
        int liczbaA = 1;
        int liczbaB = 2;
        System.out.println("dodawanie: " + (liczbaA + liczbaB));
        System.out.println("odejmowanie: " + (liczbaA - liczbaB));
        System.out.println("mnożenie: " + (liczbaA * liczbaB));
        System.out.println("modulo: " + (liczbaA % liczbaB));
        //b
        double liczbaX = 1;
        double liczbaY = 2;
        System.out.println("dodawanie: " + (liczbaX + liczbaY));
        System.out.println("odejmowanie: " + (liczbaX - liczbaY));
        System.out.println("mnożenie: " + (liczbaX * liczbaY));
        System.out.println("modulo: " + (liczbaX % liczbaY));



    }
}
