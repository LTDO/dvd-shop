package net.dvd;

public class DVD {

    private int stockLevel;
    private String title;
    private double price;

    public DVD(String title, double price, int stockLevel){

        this.title = title;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int stockLevel() {
        return stockLevel;
    }

    public void sell(int qty) {
        if (this.stockLevel > 0) {
            this.stockLevel -= qty;
        }
    }
}
