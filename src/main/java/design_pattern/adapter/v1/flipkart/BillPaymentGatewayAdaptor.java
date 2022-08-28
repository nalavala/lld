package design_pattern.adapter.v1.flipkart;

import design_pattern.adapter.v1.external.BillPaymentGateway;
import design_pattern.adapter.v1.external.BillUPaymentStatus;

public class BillPaymentGatewayAdaptor implements PaymentGateway {

    private BillPaymentGateway billPaymentGateway = new BillPaymentGateway();
    @Override
    public Long payViaCC(Long cardNumber, int cvv, int expireMonth, int expireYear) {
        return 345345l;
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
        BillUPaymentStatus status = billPaymentGateway.checkPaymentStatus(transactionId);
        if(status == BillUPaymentStatus.SUCCEDDED) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.PENDING;
    }
}
