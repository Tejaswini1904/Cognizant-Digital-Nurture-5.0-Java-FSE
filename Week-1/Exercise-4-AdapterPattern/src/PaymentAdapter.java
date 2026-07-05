public class PaymentAdapter implements PaymentProcessor {

    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    @Override
    public void processPayment(double amount) {
        oldGateway.makePayment(amount);
    }
}
