package uebung_b;

public class Bank {
    private String blz;

    public Bank(){
        blz = "Leer";
    }

    public Bank(String b){
        setBlz(b);
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getBlz() {
        return blz;
    }

    public void datenausgabe(){
        System.out.print(getBlz());
    }
}
