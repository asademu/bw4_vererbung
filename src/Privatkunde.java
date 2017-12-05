public class Privatkunde extends Kunde{
    private String bundesLand;

    public Privatkunde(){
        super();
        bundesLand = "";
    }

    public Privatkunde(String nachName, int teleMinuten, String bundesLand){
        super(nachName, teleMinuten);
        setBundesLand(bundesLand);
    }

    public void setBundesLand(String bundesLand) {
        this.bundesLand = bundesLand;
    }

    public String getBundesLand() {
        return bundesLand;
    }

    public void datenEingabe(){
        super.datenEingabe();
        System.out.print("Bundesland: ");
        setBundesLand(Tastatur.liesString());
    }

    public void datenAusgabe(){
        super.datenAusgabe();
        System.out.println("Bundesland: " + getBundesLand());
    }
}
