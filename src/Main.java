import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("a + b = "+ (a+b));
        System.out.println("a + c = "+ (a+c));
        System.out.println("b + c = "+ (b+c));
        System.out.println("(b + c) * 213 = "+ (b+c)*213);
        if(a < b)
            System.out.println("a jest mniejsze od b");
        else
            System.out.println("a jest większe od b");
        if(a < c)
            System.out.println("a jest mniejsze od c");
        else
            System.out.println("a jest większe od c");
        if(b < c)
            System.out.println("b jest mniejsze od c");
        else
            System.out.println("b jest większe od c");
    }
}
