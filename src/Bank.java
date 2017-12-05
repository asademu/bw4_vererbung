//superclass 'Bank'
public class Bank {
    private String blz;

    public Bank(){
        blz = "";
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
        System.out.println("BLZ: " + getBlz());
    }
}
