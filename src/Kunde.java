public class Kunde {
    private String nachName;
    private int teleMinuten;

    public Kunde(){
        nachName = "";
        teleMinuten = 0;
    }

    public Kunde(String nachName, int teleMinuten){
        setNachName(nachName);
        setTeleMinuten(teleMinuten);
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setTeleMinuten(int teleMinuten) {
        if (teleMinuten >= 0){
            this.teleMinuten = teleMinuten;
        }
    }

    public String getNachName() {
        return nachName;
    }

    public int getTeleMinuten() {
        return teleMinuten;
    }

    public void teleMinutenErhoehen(){
        System.out.print("Minuten: ");
        int m = Tastatur.liesInt();
        if (m > 0){
            setTeleMinuten(getTeleMinuten() + m);
        }
    }

    public void datenEingabe(){
        System.out.print("Nachname: ");
        setNachName(Tastatur.liesString());

        System.out.print("Teleminuten: ");
        setTeleMinuten(Tastatur.liesInt());
    }

    public void datenAusgabe(){
        System.out.println("Nachname: " + getNachName());
        System.out.println("Teleminuten: " + getTeleMinuten());
    }
}
