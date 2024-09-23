public class Hora {
    private String hora;
    private int vyska;

    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setVyska(int vyska) {
        this.vyska = vyska;
    }
    public String getHora() {
        return hora;
    }
    public int getVyska() {
        return vyska;
    }

    public Hora(String hora, int vyska) {
        this.hora = hora;
        this.vyska = vyska;
    }
    public Hora() {

    }
}
