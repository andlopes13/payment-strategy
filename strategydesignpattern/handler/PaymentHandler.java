package payment.strategydesignpattern.handler;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;
import payment.strategydesignpattern.paymentTypes.CashPayment;
import payment.strategydesignpattern.paymentTypes.CreditCardPayment;
import payment.strategydesignpattern.paymentTypes.MBWay;
import payment.strategydesignpattern.paymentTypes.PaypalPayment;

import java.util.ArrayList;
import java.util.List;

public class PaymentHandler {

    private final List<Payment> payments = new ArrayList<>();

    public PaymentHandler() {

        this.configurePayments();
    }

    private void configurePayments() {

        this.payments.add(new CashPayment());
        this.payments.add(new CreditCardPayment());
        this.payments.add(new PaypalPayment());
        this.payments.add(new MBWay());
    }

    public static PaymentHandler builder() {
        return new PaymentHandler();
    }

    public void executePayment(TypePaymentEnum typePaymentEnum) {
        boolean paymentFound = false;

        for (Payment payment : this.payments) {
            if (typePaymentEnum.equals(payment.identifierPayment())) {
                payment.pay();
                paymentFound = true;
                break; // Saindo do loop após encontrar e processar o pagamento
            }
        }

        if (!paymentFound) {
            throw new IllegalArgumentException("Payment identifier not found");
        }
    }
}
