public class Main {

    public static void main(String[] args) {

        OldPaymentGateway oldGateway = new OldPaymentGateway();

        PaymentProcessor paymentProcessor = new PaymentAdapter(oldGateway);

        paymentProcessor.processPayment(2500.00);
    }
}
