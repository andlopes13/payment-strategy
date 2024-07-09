package payment.strategydesignpattern.paymentTypes;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;

public class PaypalPayment implements Payment {

    @Override
    public TypePaymentEnum identifierPayment() {
        return TypePaymentEnum.PAYPAL;
    }

    @Override
    public void pay() {
        System.out.println("Paypal");
    }
}
