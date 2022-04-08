
package vizsgafelkeszit;

import java.util.Objects;

public class Eszkoz implements Comparable<Eszkoz> {
    private String nev;
    private double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nev);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.suly) ^ (Double.doubleToLongBits(this.suly) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eszkoz other = (Eszkoz) obj;
        if (Double.doubleToLongBits(this.suly) != Double.doubleToLongBits(other.suly)) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }

    @Override
    public int compareTo(Eszkoz o) {
        return this.nev.compareTo(o.nev);
    }

  
    
    
}
