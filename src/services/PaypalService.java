package services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.20;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        Double totalAmount = amount;
        for (int i = 1; i <= months; i++) {
            totalAmount += (0.1 * i);
        }
        return totalAmount;
    }
}