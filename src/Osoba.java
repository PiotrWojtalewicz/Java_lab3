public class Osoba {
    String imię;
    String nazwisko;
    Integer indeks;

    Osoba(){

    }
    public String getImię(){return imię;}
    public String getNazwisko(){return nazwisko;}
    public Integer getIndeks(){ return indeks;}

    public void setImię(String imię) {
        this.imię = imię;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }
    public void wyświetl(){
        System.out.println("Imię osoby: " + imię + "\nNazwisko osoby: " + nazwisko + "\nIndeks osoby: " +indeks);
    }
}

