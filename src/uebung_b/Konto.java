package uebung_b;

public class Konto extends Bank {
    private float kapital;

    public Konto(){
        super();
        kapital = 0;
    }

    public Konto(String b, float k){
        super(b);
        setKapital(k);
    }

    public void setKapital(float kapital){
        if (kapital >= 0){
            this.kapital = kapital;
        }
    }


}
