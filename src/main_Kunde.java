public class main_Kunde {
    public static void main(String[] args) {
        boolean init = true;
        int wahl, wahl2 = 0;
        Kunde objectInProgress = new Kunde();

        Privatkunde einPrivatkunde = new Privatkunde();
        Privatkunde zweiPrivatkunde = new Privatkunde("Beejay", 12, "Hamburg");

        GeschaeftsKunde einGeKunde = new GeschaeftsKunde();
        GeschaeftsKunde zweiGeKunde = new GeschaeftsKunde("Kokolores", 12141, "Mivea");

        do {
            do {
                System.out.println("Kunde 1, 2, 3 oder 4? ");
                System.out.println("0 - Beenden");
                wahl = Tastatur.liesInt();

                switch (wahl) {
                    case 1:
                        objectInProgress = einPrivatkunde;
                        break;
                    case 2:
                        objectInProgress = zweiPrivatkunde;
                        break;
                    case 3:
                        objectInProgress = einGeKunde;
                        break;
                    case 4:
                        objectInProgress = zweiGeKunde;
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Fehleingabe");
                        init = false;
                }
            } while (!init);

            do {
                if (wahl != 0) {
                    System.out.println("1 - Datenausgabe");
                    System.out.println("2 - Minuten erhoehen");
                    System.out.println("3 - Dateneingabe");
                    System.out.println("0 - Zurueck");

                    wahl2 = Tastatur.liesInt();
                    switch (wahl2) {
                        case 1:
                            objectInProgress.datenAusgabe();
                            break;
                        case 2:
                            objectInProgress.teleMinutenErhoehen();
                            break;
                        case 3:
                            objectInProgress.datenEingabe();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Fehleingabe");
                    }
                }
            }while (wahl2 != 0);
        }while (wahl != 0);
    }
}
