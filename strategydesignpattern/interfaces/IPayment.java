package payment;

public interface IPayment {

    payment.TypePaymentEnum identifierPayment();
    void pay();
}
