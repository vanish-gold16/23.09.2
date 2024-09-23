//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hora Snezka = new Hora("Sněžka", 1602);
        Hora Praded = new Hora("Praděd",1491);

        System.out.println(Snezka.getHora() + " - " + Snezka.getVyska() + "m");
        System.out.println(Praded.getHora() + " - " + Praded.getVyska() + "m");

        System.out.println("***********************************");

        Napoj vino = new Napoj("víno",120, 10);
        Napoj mineralka = new Napoj("minerálka",15);
        Napoj limonada = new Napoj();
        limonada.nazevNapoje = "limonada";
        limonada.cenaNapoje = 20;
        limonada.procentoNapoje = 0;

        System.out.println(vino.getNazevNapoje() + " stoji " + vino.getCenaNapoje() + "kc a ma " + vino.getProcentoNapoje() + "% alcoholu");
        System.out.println(mineralka.getNazevNapoje() + " stoji " + mineralka.getCenaNapoje() + "kc a ma " + mineralka.getProcentoNapoje() + "% alcoholu");
        System.out.println(limonada.getNazevNapoje() + " stoji " + limonada.getCenaNapoje() + "kc a ma " + limonada.getProcentoNapoje() + "% alcoholu");

        System.out.println("***********************************");

        Trida C1b = new Trida("C1b", 32);
        Trida C4b = new Trida("C4b", 26);

        System.out.println("Trida " + C1b.getNazev() + " ma " + C1b.getPocetZaku() + " zaku");
        System.out.println("Trida " + C4b.getNazev() + " ma " + C4b.getPocetZaku() + " zaku");

        if(C1b.getPocetZaku() > C4b.getPocetZaku()){
            System.out.println("Trida " + C1b.getNazev() + " ma vice zaku");
        }
        else
            System.out.println("Trida " + C4b.getNazev() + " ma vice zaku");
    }
}