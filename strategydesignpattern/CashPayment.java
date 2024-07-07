package payment;

public class CashPayment implements payment.IPayment {

    @Override
    public payment.TypePaymentEnum identifierPayment() {
        return payment.TypePaymentEnum.CASH;
    }

    @Override
    public void pay() {

        System.out.println("Payment cash");
        System.out.println("Payment cash 66666");
    }
}
