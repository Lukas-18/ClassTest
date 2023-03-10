package objektorientierung_ersteSchritte;

import java.time.Duration;

public class Flugzeug extends Kosten{

    /*
    "sitzplätze", um die Anzahl der Sitze des Flugzeugs zu speichern.
    "flugzeugmarke", um den Namen oder die Marke des Flugzeugs zu speichern.
    "flugzeit", um die Dauer des Fluges in Minuten zu speichern.
    "reiseZiel", um das Ziel des Fluges zu speichern.
    "ausgangsLand", um das Land zu speichern, in dem der Flug beginnt.
    */

    private int sitzplätze;
    private String flugzeugmarke;
    private long flugzeit;
    private String reiseZiel;
    private String ausgangsLand;

    //extend

    public double getPrice() {
        return this.getPrice();
    }

    public void setPrice(double price) {
        this.setPrice(price);

    }

    //region Region:Konstruktor
    public Flugzeug() {
    }

    public Flugzeug(int _sitzplätze, String _flugzeugmarke, String _reiseZiel, String _ausgangsLand){
        this.flugzeugmarke = _flugzeugmarke;
        this.ausgangsLand = _ausgangsLand;
        this.reiseZiel = _reiseZiel;
        this.sitzplätze = _sitzplätze;
    }

    //endregion

    //region Region:Getter/Setter

    public String getFlugzeugmarke() {
        return flugzeugmarke;
    }

    public void setFlugzeugmarke(String name) {
        this.flugzeugmarke = name;
    }

    public String getReiseziel() {
        return reiseZiel;
    }

    public void setReiseziel(String reiseziel) {
        this.reiseZiel = reiseziel;
    }


    public long getFlugzeit() {
        return flugzeit;
    }

    public void setFlugzeit(long flugzeit) {
        this.flugzeit = flugzeit;
    }

    public String getAusgangsLand() {
        return ausgangsLand;
    }

    public void setAusgangsLand(String ausgangsLand) {
        this.ausgangsLand = ausgangsLand;
    }

    public int getSitzplätze(){
        return sitzplätze;
    }

    public void setSitzplätze(int sitzplätze){
        this.sitzplätze = sitzplätze;
    }

    //endregion

    //region Region:Funktion
        //Alt. switchCountrys
    public void fliegen(){
        String temp = this.ausgangsLand;
        this.ausgangsLand = this.reiseZiel;
        this.reiseZiel = temp;
    }

    public void berechneFlugzeit(){
        this.flugzeit = (long) (Math.random() * 1000);
    }

    //endregion
}
