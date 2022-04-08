package vizsgafelkeszit;

public class Harcos extends Karakter {

    private int ero, ugyesseg;

    public Harcos(String nev, String faj, int ero, int ugyesseg) throws NevKivetel {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    @Override
    public String toString() {
        return "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + '}';
    }

 

}
