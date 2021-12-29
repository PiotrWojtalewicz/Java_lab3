/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
private int x,y,z;


    /* a) Pusty konstruktor */
    Punkt() {
    }

    /* konstruktor z parametrami */
    Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ(){ return z;}

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        zmienY(); // wywołanie prywatnej metody (dostęp do niej tylko w obrębie tego pliku i klasy)
        this.y = y;
    }



    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}
