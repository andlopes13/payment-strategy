package payment;

public class PaypallPayment implements payment.IPayment {
    @Override
    public payment.TypePaymentEnum identifierPayment() {
        return payment.TypePaymentEnum.PAYPALL;
    }

    @Override
    public void pay() {

        System.out.println("Paypal");
    }
}
