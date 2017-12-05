public class GeschaeftsKunde extends Kunde{
    private String firmenName;

    public GeschaeftsKunde(){
        super();
        firmenName = "";
    }

    public GeschaeftsKunde(String nachName, int teleMinuten, String firmenName){
        super(nachName, teleMinuten);
        setFirmenName(firmenName);
    }

    public void setFirmenName(String firmenName) {
        this.firmenName = firmenName;
    }

    public String getFirmenName() {
        return firmenName;
    }

    public void datenEingabe(){
        super.datenEingabe();
        System.out.print("Firmenname: ");
        setFirmenName(Tastatur.liesString());
    }

    public void datenAusgabe(){
        super.datenAusgabe();
        System.out.println("Firmenname: " + getFirmenName());
    }
}
