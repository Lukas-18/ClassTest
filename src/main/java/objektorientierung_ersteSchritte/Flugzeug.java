package objektorientierung_ersteSchritte;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

public class Flugzeug extends Kosten{
    private int sitzplätze;
    private String flugzeugmarke;
    private long flugzeit;
    private String reiseZiel;
    private String ausgangsLand;

    public Flugzeug(int _sitzplätze, String _flugzeugmarke, String _reiseZiel, String _ausgangsLand){
        this.flugzeugmarke = _flugzeugmarke;
        this.ausgangsLand = _ausgangsLand;
        this.reiseZiel = _reiseZiel;
        this.sitzplätze = _sitzplätze;
    }

    public void fliegen(){
        String temp = this.ausgangsLand;
        this.ausgangsLand = this.reiseZiel;
        this.reiseZiel = temp;
    }

    public void berechneFlugzeit(){
        this.flugzeit = (long) (Math.random() * 1000);
    }
}
