public class Koerper {
    private float breite, hoehe, fuellstand;

    public Koerper(){
        setBreite(0);
        setHoehe(0);
        setFuellstand(0);
    }

    public Koerper(float breite, float hoehe, float fuellstand){
        setBreite(breite);
        setHoehe(hoehe);
        setFuellstand(fuellstand);
    }

    //region Setter
    public void setBreite(float breite) {
        this.breite = breite;
    }

    public void setHoehe(float hoehe) {
        if (hoehe >= fuellstand) {
            this.hoehe = hoehe;
        }
    }

    public void setFuellstand(float fuellstand) {
        if (fuellstand >= 0 && fuellstand <= getHoehe()) {
            this.fuellstand = fuellstand;
        }
    }
    //endregion

    //region Getter
    public float getBreite() {
        return breite;
    }

    public float getHoehe() {
        return hoehe;
    }

    public float getFuellstand() {
        return fuellstand;
    }
    //endregion

    public double volumenKapazitaet(){
        double maxVol = 3.14 * (getBreite() / 2) * (getBreite() / 2)  * getHoehe() / 1000;
        return maxVol;
    }

    public double volumenSubstanz(){
        return (volumenKapazitaet() / getHoehe() * getFuellstand());
    }
}
