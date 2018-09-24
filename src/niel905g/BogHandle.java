package niel905g;

/**
 * @Author niels on 24-Sep-18.
 */
public class BogHandle {
    private Bog bogen;

    public BogHandle(Bog bog) {
        setObject(bog);
    }

    public void setObject(Bog bog) {
        bogen = bog;
    }

    public void setPris(double pris) {
        bogen.setPris(pris);
    }

    public void addAntal(int antal) {
        bogen.addAntal(antal);
    }

    public void subAntal(int antal) {
        bogen.subAntal(antal);
    }

    @Override
    public String toString() {
        return "BogHandle{" +
                "bogen=" + bogen +
                '}';
    }
}
