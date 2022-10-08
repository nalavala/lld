package design_parking_lot.model;

public class Payment extends BaseModel {

    private Bill bill;
    private ModeOfPayment mop;
    private PaymentStatus status;
    private String referenceId;


    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public ModeOfPayment getMop() {
        return mop;
    }

    public void setMop(ModeOfPayment mop) {
        this.mop = mop;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
