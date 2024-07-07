package payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentHandler {

    private final List<payment.IPayment> payments = new ArrayList<>();

    public PaymentHandler() {

        this.configurePayments();
    }

    private void configurePayments() {

        this.payments.add(new payment.CashPayment());
        this.payments.add(new payment.CreditCardPayment());
        this.payments.add(new payment.PaypallPayment());
        this.payments.add(new payment.MBWay());
    }

    public static PaymentHandler builder() {
        return new PaymentHandler();
    }

    public void executePayment(payment.TypePaymentEnum typePaymentEnum) {

        this.payments
                .stream()
                .filter(iPayment -> typePaymentEnum.equals(iPayment.identifierPayment()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Payment identifier not found"))
                .pay();
    }
}
