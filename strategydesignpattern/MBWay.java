package payment;

public class MBWay implements payment.IPayment {

    @Override
    public payment.TypePaymentEnum identifierPayment() {
        return payment.TypePaymentEnum.MBWAY;
    }

    @Override
    public void pay() {

        System.out.println("MBWay");
    }
}
