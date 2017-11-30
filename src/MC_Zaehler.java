public class MC_Zaehler {
    public static void main(String[] args) {
        int z;
        String n;
        Zaehler seitenZaehler = new Zaehler(17);
        Tierzaehler affenZaehler = new Tierzaehler(10, "Orangutans");

        System.out.print("Seitenzahl erhoehen um: ");
        seitenZaehler.erhoeheZaehler(Tastatur.liesInt());
        System.out.println("Seitenanzahl: " + seitenZaehler.getZaehlerstand());

        System.out.print(affenZaehler.getTiername() + " toeten: ");
        affenZaehler.verringereZaehler(Tastatur.liesInt());
        affenZaehler.datenausgabe();
    }
}
