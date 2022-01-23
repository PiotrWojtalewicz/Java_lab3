import javax.naming.Name;
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

    public void setName(String x) {
        this.name = x;
    }
    public void setSurname(String y) {
        this.surname = y;
    }
    public void setAge(int z) {
        this.age = z;
    }
    public void setIncome(int a) {
        this.income = a;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getIncome() {
        return income;
    }
}

