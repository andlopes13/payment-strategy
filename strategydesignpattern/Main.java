package payment.strategydesignpattern;

import payment.strategydesignpattern.enums.TypePaymentEnum;
import payment.strategydesignpattern.handler.PaymentHandler;

public class Main {

    public static void main(String[] args) {

        PaymentHandler.builder().executePayment(TypePaymentEnum.CASH);
        PaymentHandler.builder().executePayment(TypePaymentEnum.CREDIT_CARD);
        PaymentHandler.builder().executePayment(TypePaymentEnum.PAYPAL);
        PaymentHandler.builder().executePayment(TypePaymentEnum.MB_WAY);
    }
}
