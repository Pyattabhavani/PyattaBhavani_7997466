public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.makePayment(2000);

        context.setStrategy(new PayPalPayment());
        context.makePayment(3500);
    }
}