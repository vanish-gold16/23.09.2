public class Napoj {
    String nazevNapoje;
    int cenaNapoje;
    int procentoNapoje;

    public void setCenaNapoje(int cenaNapoje) {
        this.cenaNapoje = cenaNapoje;
    }
    public void setNazevNapoje(String nazevNapoje) {
        this.nazevNapoje = nazevNapoje;
    }

    public void setProcentoNapoje(int procentoNapoje) {
        this.procentoNapoje = procentoNapoje;
    }

    public String getNazevNapoje() {
        return nazevNapoje;
    }

    public int getCenaNapoje() {
        return cenaNapoje;
    }

    public int getProcentoNapoje() {
        return procentoNapoje;
    }

    public Napoj(String nazevNapoje, int cenaNapoje, int procentoNapoje) {
        this.nazevNapoje = nazevNapoje;
        this.cenaNapoje = cenaNapoje;
        this.procentoNapoje = procentoNapoje;
    }
    public Napoj(String nazevNapoje, int cenaNapoje) {
        this.nazevNapoje = nazevNapoje;
        this.cenaNapoje = cenaNapoje;
        procentoNapoje = 0;
    }

    public Napoj() {
    }

}
