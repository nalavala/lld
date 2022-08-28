package design_pattern.adapter.v0.external;

public class RazorpayGateway {

    public String payByCreditCard(String cardNo, String cvv, String month, String year) {
        System.out.println("payment done by razorapy");
        return "33234";
    }

    public boolean checkPaymentStatus(String id) {
        return true;
    }
}
