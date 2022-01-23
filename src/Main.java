public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        /* Tworzymy objekty wszystkich typów i wyświetlamy ich zawartość */

        Library library = new Library("Fantasy", "Harry Potter and Goblet of Fire", 2);
        System.out.println(library.toString());
        System.out.println("book(s) on stock: " + library.HowMuchInStock() + "\n");

        Osoba osoba = new Osoba( "Daniel", "Mądry", 56, 5000);
        System.out.println(osoba.toString());
        System.out.println("first client: " + osoba + "\n");


        Student student = new Student( "Mikołaj", "Słaby", 22,"management and economics", "economics");
        student.setDepartment("IT");
        student.setFieldOfStudy("Frontend");
        System.out.println(student.toString());
        System.out.println("second client:"+ student.department + "\n" + student.fieldOfStudy + "\n");




/* c) */

        Osoba person = new Osoba("Piotr", "Wojtalewicz", 22 , 300);
        person.setIncome(4000);
        System.out.println(person.toString());
        System.out.println("third client: " + person + "\n");

    }
    

    }

