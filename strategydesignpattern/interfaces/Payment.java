package payment.strategydesignpattern.interfaces;

import payment.strategydesignpattern.enums.TypePaymentEnum;

public interface Payment {

    TypePaymentEnum identifierPayment();
    void pay();
}
