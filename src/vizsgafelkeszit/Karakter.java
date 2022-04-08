package vizsgafelkeszit;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;




public abstract class Karakter  {

    private String nev, faj;
    private ArrayList<Eszkoz> eszkozok;

    public Karakter(String nev, String faj) throws NevKivetel {

        if (nev.length() < 3) {
            throw new NevKivetel("A megadott név kevesebb, mint 3 karakter: " + nev);
        }
        this.nev = nev;
        this.faj = faj;
        eszkozok = new ArrayList<>();
    }

    public void eszkoztFelvesz(Eszkoz eszkoz) {
        eszkozok.add(eszkoz);
    }

   
    public boolean eszkoztEldob (Eszkoz eszkoz){
        return eszkozok.remove(eszkoz);
    }
    public void eszkoztEldob() {
        
        for (int i = eszkozok.size()-1; i >= 0; i--) {
            eszkoztEldob(eszkozok.get(i));
            
        }
    }
        
        
        public void nevSzerintRendez(){
            Collections.sort(eszkozok);
        }

    

    @Override
    public String toString() {
       
        return "Karakter{" + "nev=" + nev + ", faj=" + faj + '}';
    }

}


