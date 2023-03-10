package objektorientierung_ersteSchritte;

public class Fernseher {

    private boolean istAn = false;
    private int aktuellerSender;
    private int lautstärke;

    //region Region.Konstruktor

    public Fernseher() {
    }

    public Fernseher(boolean istAn, short aktuellerSender, int lautstärke) {
        this.istAn = istAn;
        this.aktuellerSender = aktuellerSender;
        this.lautstärke = lautstärke;
    }

    //endregion

    //region Region:Funktionen

    public void lautstärkeÄndern(int _difference){
        this.lautstärke =+ _difference;
    }

    public void umschalten(int _difference){
        this.aktuellerSender =+ _difference;
    }

    public void schalteAn(){
        this.istAn = true;
    }

    public void schalteAus(){
        this.istAn = false;
    }

    //endregion

    //region Region:Getter/Setter

    public boolean isIstAn() {
        return istAn;
    }

    public void setIstAn(boolean istAn) {
        this.istAn = istAn;
    }

    public int getLautstärke() {
        return lautstärke;
    }

    public void setLautstärke(int lautstärke) {
        this.lautstärke = lautstärke;
    }

    public int getAktuellerSender() {
        return aktuellerSender;
    }

    public void setAktuellerSender(int aktuellerSender) {
        this.aktuellerSender = aktuellerSender;
    }

    //endregion
}
