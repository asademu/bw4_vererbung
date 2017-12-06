import javax.sound.midi.SysexMessage;

public class main_Koerper {
    public static void main(String[] args) {
        int wahl;
        float oel;
        Zylinder oeltank = new Zylinder(20, 50, 0);

        do {
            System.out.println("1 - Fuellstand");
            System.out.println("2 - Kapazitaet");
            System.out.println("3 - Oel zufuehren");
            System.out.println("4 - Oel entnehmen");
            System.out.println("0 - Beenden");
            wahl = Tastatur.liesInt();

            switch (wahl) {
                case 1:
                    System.out.println("Fuellstand: " + oeltank.getFuellstand() + " von " + oeltank.getHoehe() + " cm");
                    break;
                case 2:
                    System.out.println("Kapazitaet: " + oeltank.volumenKapazitaet() + "L");
                    break;
                case 3:
                    System.out.println("auffuellen: ");
                    oel = Tastatur.liesFloat();
                    if (oel >= 0) {
                        oeltank.setFuellstand(oeltank.getFuellstand() + oel);
                    }
                    break;
                case 4:
                    System.out.println("abzapfen: ");
                    oel = Tastatur.liesFloat();
                    if (oel >= 0 && oeltank.getFuellstand() - oel >= 0){
                        oeltank.setFuellstand(oeltank.getFuellstand() - oel);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Fehleingabe");
            }
        }while (wahl != 0);
    }
}
