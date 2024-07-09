package payment.strategydesignpattern.paymentTypes;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;

public class CreditCardPayment implements Payment {

    @Override
    public TypePaymentEnum identifierPayment() {
        return TypePaymentEnum.CREDIT_CARD;
    }

    @Override
    public void pay() {
        System.out.println("Payment credit card");
    }
}
