package payment

public class Main {

    public static void main(String[] args) {

        payment.PaymentHandler.builder().executePayment(payment.TypePaymentEnum.CASH);
        payment.PaymentHandler.builder().executePayment(payment.TypePaymentEnum.CREDIT_CARD);
        payment.PaymentHandler.builder().executePayment(payment.TypePaymentEnum.PAYPALL);
        payment.PaymentHandler.builder().executePayment(payment.TypePaymentEnum.MBWAY);
    }
}
