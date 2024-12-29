public class StockAccountManagement {
    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        portfolio.addStock(new Stock("Apple", 10, 150.0));
        portfolio.addStock(new Stock("Google", 5, 2800.0));
        portfolio.addStock(new Stock("Tesla", 8, 1000.0));

        portfolio.printStockReport();
    }
}