package objektorientierung_ersteSchritte;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Fernseher extends CPU implements ElektronischeGeraete{

    private boolean istAn = false;
    private int aktuellerSender;
    private int lautstärke;
    
    //region Region:Funktionen

    public void lautstärkeÄndern(int _difference){
        this.lautstärke =+ _difference;
    }

    public void umschalten(int _difference){
        this.aktuellerSender =+ _difference;
    }

    @Override
    public void anschalten(){
        this.istAn = true;
    }

    @Override
    public void ausschalten(){
        this.istAn = false;
    }

    //endregion

}
