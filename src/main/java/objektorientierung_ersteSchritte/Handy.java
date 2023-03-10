package objektorientierung_ersteSchritte;

public class Handy implements ElektronischeGeraete{

    public static int NewArtNR = 1;

    private int ArtNR;
    private boolean istAn = false;


    public Handy() {
        this.ArtNR  = NewArtNR++;
    }

    public int getArtNR() {
        return ArtNR;
    }

    public void setArtNR(int artNR) {
        ArtNR = artNR;
    }

    @Override
    public void anschalten() {
        this.istAn = true;
    }

    @Override
    public void ausschalten() {
        this.istAn = false;
    }
}
