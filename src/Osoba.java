import java.security.ProtectionDomain;

public class Osoba {
    protected String name;
    protected String surname;
    protected int age;


public Osoba() {
            this.name = "";
            this.surname = "";
            this.age = 0;
        }

    public Osoba(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    @Override
    public String toString() {
        return "Osoba: {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    }

