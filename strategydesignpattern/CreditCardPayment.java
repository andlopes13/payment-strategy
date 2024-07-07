package payment;

public class CreditCardPayment implements payment.IPayment {

    @Override
    public payment.TypePaymentEnum identifierPayment() {
        return payment.TypePaymentEnum.CREDIT_CARD;
    }

    @Override
    public void pay() {

        System.out.println("Payment credit card");
    }
}
