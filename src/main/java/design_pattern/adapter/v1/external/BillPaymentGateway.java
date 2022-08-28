package design_pattern.adapter.v1.external;

public class BillPaymentGateway {


    public Long payByCreditCard(String cardNo, String cvv, String date) {
        System.out.println("payment done by BillU");
        return 343l;
    }

    public BillUPaymentStatus checkPaymentStatus(Long id) {
        return BillUPaymentStatus.SUCCEDDED;
    }
}
