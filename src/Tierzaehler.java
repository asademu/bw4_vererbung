public class Tierzaehler extends Zaehler {
    private String tiername;

    public Tierzaehler(){
        super();
        tiername = "Leer";
    }

    public Tierzaehler(int z, String n){
        super(z);
        tiername = n;
    }

    public void setTiername(String tiername){
        this.tiername = tiername;
    }

    public String getTiername(){
        return tiername;
    }

    public void datenausgabe(){
        System.out.println("Es leben noch " + getZaehlerstand() + " " + tiername);
    }
}
