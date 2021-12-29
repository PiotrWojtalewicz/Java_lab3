import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student Piotr = new Student();
        Piotr.imie = "Piotr";
        Piotr.nazwisko = "Wojtalewicz";
        Piotr.wiek = 22;
        Piotr.CzyStudiuje = true;
        studentList.add(Piotr);

        Student Michal = new Student();
        Michal.imie = "Michal";
        Michal.nazwisko = "Kowalski";
        Michal.wiek = 26;
        Michal.CzyStudiuje = true;
        studentList.add(Michal);

        Student Jędrek = new Student();
        Jędrek.imie = "Jędrek";
        Jędrek.nazwisko = "Malinowski";
        Jędrek.wiek = 55;
        Jędrek.CzyStudiuje = false;
        studentList.add(Jędrek);


        for (Student s : studentList) {
            System.out.println(s.imie + " - " + s.nazwisko + " - " + s.wiek + " lat " + "  - " +  " active student? " +s.CzyStudiuje);
        }
        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
    }

}
