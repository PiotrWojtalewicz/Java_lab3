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
    }
}
