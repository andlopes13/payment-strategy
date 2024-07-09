package payment.strategydesignpattern.paymentTypes;

import payment.strategydesignpattern.interfaces.Payment;
import payment.strategydesignpattern.enums.TypePaymentEnum;

public class MBWay implements Payment {

    @Override
    public TypePaymentEnum identifierPayment() {
        return TypePaymentEnum.MB_WAY;
    }

    @Override
    public void pay() {
        System.out.println("MBWay");
    }
}
