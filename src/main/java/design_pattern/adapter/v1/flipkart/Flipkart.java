package design_pattern.adapter.v1.flipkart;

public class Flipkart {
    
    private PaymentGateway gateway;

    public Flipkart(PaymentGateway paymentGateway) {
        this.gateway = paymentGateway;
    }
    
    
    public void payAmount(Long cardNo, int cvv, int expireMonth, int expireyear) {
        Long trasaction = gateway.payViaCC(cardNo, cvv, expireMonth, expireyear);
        while(gateway.getStatus(trasaction) == PaymentStatus.PENDING) {
            System.out.println("waiting");
        }
    }


}
