package objektorientierung_ersteSchritte;

public class Kosten {
    private double price;
    private int mwst;


    public Kosten() {
        // Standard-Konstruktor
    }

    public Kosten(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

