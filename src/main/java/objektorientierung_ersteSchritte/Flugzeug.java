package objektorientierung_ersteSchritte;

import javax.swing.plaf.synth.Region;

public class Flugzeug {
    private int sitzplaetze;
    private String flugzeugmarke;
    private String reiseziel;
    private String ausgangsLand;


    public Flugzeug() {
    }

    public Flugzeug(String _name, String _ausgangsLand){
        this.flugzeugmarke = _name;
        this.ausgangsLand = _ausgangsLand;
    }
    
    public void fliegen(){

    }

//region Region:Getter/Setter

    public String getFlugzeugmarke() {
        return flugzeugmarke;
    }

    public void setFlugzeugmarke(String flugzeugmarke) {
        this.flugzeugmarke = flugzeugmarke;
    }

    public String getReiseziel() {
        return reiseziel;
    }

    public void setReiseziel(String reiseziel) {
        this.reiseziel = reiseziel;
    }

    public String getAusgangsLand() {
        return ausgangsLand;
    }

    public void setAusgangsLand(String ausgangsLand) {
        this.ausgangsLand = ausgangsLand;
    }

    public int getSitzplaetze(){
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitzplaetze){
        this.sitzplaetze = sitzplaetze;
    }

//endregion

}
