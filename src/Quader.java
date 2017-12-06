public class Quader extends Koerper {
    private float laenge;

    public Quader(){
        super();
        setLaenge(0);
    }

    public Quader(float breite, float hoehe, float fuellstand, float laenge){
        super(breite, hoehe, fuellstand);
        setLaenge(laenge);
    }

    public void setLaenge(float laenge) {
        this.laenge = laenge;
    }

    public float getLaenge() {
        return laenge;
    }

    @Override
    public double volumenKapazitaet() {
        return (getLaenge() * getBreite() * getHoehe());
    }

    @Override
    public double volumenSubstanz() {
        return (volumenKapazitaet() * getFuellstand() / 100);
    }
}
