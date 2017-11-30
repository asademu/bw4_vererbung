public class Zaehler {
    private int zaehlerstand;

    public Zaehler(){
        zaehlerstand = 0;
    }

    public Zaehler(int z){
        setZaehlerstand(z);
    }

    public void setZaehlerstand(int zaehlerstand){
        if (zaehlerstand >= 0){
            this.zaehlerstand = zaehlerstand;
        }
    }

    public int getZaehlerstand() {
        return zaehlerstand;
    }

    public void erhoeheZaehler(int zaehlerstand){
        setZaehlerstand(this.zaehlerstand += zaehlerstand);
    }

    public void verringereZaehler(int zaehlerstand){
        setZaehlerstand(this.zaehlerstand - zaehlerstand);
    }
}
