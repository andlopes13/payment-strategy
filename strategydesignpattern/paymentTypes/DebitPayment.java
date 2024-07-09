package payment.strategydesignpattern.paymentTypes;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;

public class DebitPayment implements Payment {

    @Override
    public TypePaymentEnum identifierPayment() {
        return TypePaymentEnum.DEBIT;
    }

    @Override
    public void pay() {
        System.out.println("Debit");
    }
}
