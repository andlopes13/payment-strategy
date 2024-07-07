package payment;

public class DebitPayment implements payment.IPayment {

    @Override
    public payment.TypePaymentEnum identifierPayment() {
        return payment.TypePaymentEnum.DEBIT;
    }

    @Override
    public void pay() {

        System.out.println("Debit");
    }
}
