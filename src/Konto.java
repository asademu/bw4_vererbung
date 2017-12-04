//subclass 'Konto' inherits from 'Bank'
public class Konto extends Bank {
    private float kapital;

    public Konto(){
        //use the superclass' constructor by adding 'super()'
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

    public float getKapital() {
        return kapital;
    }

    @Override
    public void datenausgabe() {
        super.datenausgabe();
        System.out.printf("Kapital: %,.2f €\n", getKapital());
    }
}
