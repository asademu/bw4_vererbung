public class main_Bank {
    public static void main(String[] args) {
        Konto Sparkasse = new Konto();
        Konto Volksbank = new Konto("ABC489847 HAHA", 4000);

        System.out.println("1 - Sparkasse");
        System.out.println("2 - Volksbank");
        int wahl = Tastatur.liesInt();

        switch (wahl){
            case 1:
                System.out.print("BLZ: ");
                Sparkasse.setBlz(Tastatur.liesString());
                System.out.print("Kapital: ");
                Sparkasse.setKapital(Tastatur.liesFloat());

                Sparkasse.datenausgabe();
                break;
            case 2:
                Volksbank.datenausgabe();
                break;
        }
    }

}
