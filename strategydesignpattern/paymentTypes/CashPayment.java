package payment.strategydesignpattern.paymentTypes;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;

public class CashPayment implements Payment {

    @Override
    public TypePaymentEnum identifierPayment() {
        return TypePaymentEnum.CASH;
    }

    @Override
    public void pay() {
        System.out.println("Payment cash");
    }
}
