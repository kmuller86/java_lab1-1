import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        if(24 % 3 == 0)
            System.out.println("Podzielny przez 3");
        else
            System.out.println("Niepodzielny przez 3");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int indeks = 56115;
        int wynik = (indeks % 2 == 0) ? 0 : 1;
        if(wynik == 0)
            System.out.println("Indeks jest parzysty");
        else
            System.out.println("Indeks jest nieparzysty");


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową");
        double liczba = scan.nextDouble();
        /* miało być else if()   */
        if(liczba < 666)
            System.out.println("Liczba jest mniejsza od 666");
        else
        System.out.println("Liczba jest większa lub równa 666");

    }
}
