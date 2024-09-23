public class Trida {
    private String nazev;
    private int pocetZaku;

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    public void setPocetZaku(int pocetZaku) {
        this.pocetZaku = pocetZaku;
    }
    public String getNazev() {
        return nazev;
    }
    public int getPocetZaku() {
        return pocetZaku;
    }
    public Trida(String nazev, int pocetZaku) {
        this.nazev = nazev;
        this.pocetZaku = pocetZaku;
    }
}
