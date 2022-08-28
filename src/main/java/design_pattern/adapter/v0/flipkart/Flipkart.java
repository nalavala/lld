package design_pattern.adapter.v0.flipkart;

import design_pattern.adapter.v1.external.RazorpayGateway;

public class Flipkart {
    
    private RazorpayGateway gateway = new RazorpayGateway();


    public void payAmount(Long cardNo, int cvv, int expireMonth, int expireyear) {
        String trasaction = gateway.payByCreditCard(String.valueOf(cardNo), String.valueOf(cvv), String.valueOf(expireMonth), String.valueOf(expireyear));

        while(!gateway.checkPaymentStatus(trasaction)) {
            System.out.println("waiting");
        }

    }


    /*
    This is violating
    SRP - Flipkart is also has logic how to call razorpay interface apart from its own purpose
    OCP - In case if we want to change Payment gateway to BillPaymentGateway, then we have to change existing code
    Dependency Inversion - we are creating new object

    As we are integrating with 3rd party system or external system then its better to create adaptor and work with adaptor interface rather working external system directly
     */
}
