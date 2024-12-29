import java.util.ArrayList;
import java.util.List;

class Stock {
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stock: " + name + ", Shares: " + numberOfShares + ", Share Price: " + sharePrice +
                ", Total Value: " + calculateStockValue();
    }
}