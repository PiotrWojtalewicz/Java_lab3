import java.security.ProtectionDomain;

public class Osoba {
    protected String name;
    protected String surname;
    protected int age;
    private int income;


public Osoba(String name, String surname, int age) {
            this.name = "";
            this.surname = "";
            this.age = 0;
            this.income = 0;
        }

    public Osoba(String name, String surname, int age, int income) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.income = income;
        }

    /* Metoda toString() za pomocą której będziemy wyświetlać zawartość klas */
    @Override

    public String toString() {
        return "Osoba: {" +
                "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", age= " + age + '\'' +
                ", income= " + income +
                '}';
    }
    }

