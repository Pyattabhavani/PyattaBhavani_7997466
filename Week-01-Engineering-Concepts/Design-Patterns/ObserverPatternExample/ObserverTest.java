public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser =
                new MobileApp("Bhavani");

        Observer webUser =
                new WebApp("Admin");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockData("TCS", 4250.50);
    }
}