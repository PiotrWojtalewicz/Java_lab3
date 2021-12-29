import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println( "zadanie 1a");

        enum LiczbaEnum{
            JEDEN, DWA, TRZY, CZTERY, PIĘĆ,SZEŚĆ;
        }

        System.out.println("Zadanie 1b");
        enum StatusEnum{
            KONTYNUUJEMY,KONIEC
        }
        System.out.println("Zadanie 1cd");
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        while(i > 0){
            System.out.println("true");
        i++;
        }
        static void Enum(StatusEnum, LiczbaEnum){
        switch (i) {
            case 0:
                System.out.println(StatusEnum[1]);
                break;
            case 1
                ;
        }}



        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

    }
}
