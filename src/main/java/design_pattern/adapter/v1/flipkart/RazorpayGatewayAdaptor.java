package design_pattern.adapter.v1.flipkart;

import design_pattern.adapter.v1.external.RazorpayGateway;

public class RazorpayGatewayAdaptor implements PaymentGateway {

    private RazorpayGateway razorpayGateway = new RazorpayGateway();
    @Override
    public Long payViaCC(Long cardNumber, int cvv, int expireMonth, int expireYear) {
        return Long.valueOf(razorpayGateway.payByCreditCard(String.valueOf(cardNumber), String.valueOf(cvv), String.valueOf(expireMonth), String.valueOf(expireYear)));
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(transactionId));
        if(status) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.PENDING;
    }
}
