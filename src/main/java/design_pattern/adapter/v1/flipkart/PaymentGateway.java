package design_pattern.adapter.v1.flipkart;

public interface PaymentGateway {

    Long payViaCC(Long cardNumber, int cvv, int expireMonth, int expireYear);

    PaymentStatus getStatus(Long transactionId);
}
