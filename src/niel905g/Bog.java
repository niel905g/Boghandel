package niel905g;

/**
 * @Author niels on 24-Sep-18.
 */
public class Bog {
    private String titel;
    private String forfatter;
    private double pris;
    private int antal;

    public Bog(String titel, String forfatter, double pris, int antal) {
      this.titel = titel;
      this.forfatter = forfatter;
      this.pris = pris;
      this.antal = antal;
    }

    public Bog(Bog other) {
        this(other.titel, other.forfatter, other.pris, other.antal);
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void addAntal(int antal) {
        this.antal += antal;
    }

    public void subAntal(int antal) {
        if (this.antal - antal >= 0)
            this.antal -= antal;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", pris=" + pris +
                ", antal=" + antal +
                '}';
    }
}
