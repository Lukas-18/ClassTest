package objektorientierung_ersteSchritte;

public class Handy {

    public static int NewArtNR = 1;

    private int ArtNR;


    public Handy() {
        this.ArtNR  = NewArtNR++;
    }

    public int getArtNR() {
        return ArtNR;
    }

    public void setArtNR(int artNR) {
        ArtNR = artNR;
    }
}
