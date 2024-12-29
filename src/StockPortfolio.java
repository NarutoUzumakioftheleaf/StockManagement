import java.util.ArrayList;
import java.util.List;

class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printStockReport() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            System.out.println(stock);
            totalValue += stock.calculateStockValue();
        }
        System.out.println("Total Stock Value: " + totalValue);
    }
}
