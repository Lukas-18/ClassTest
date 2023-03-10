package objektorientierung_ersteSchritte;

import java.time.Duration;

public class Flugzeug {
    private int sitzplätze;
    private String flugzeugmarke;
    private long flugzeit;
    private String reiseZiel;
    private String ausgangsLand;

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
        return reiseziel;
    }

    public void setReiseziel(String reiseziel) {
        this.reiseziel = reiseziel;
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
