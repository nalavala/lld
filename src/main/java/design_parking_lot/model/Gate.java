package design_parking_lot.model;

public class Gate extends BaseModel {
    private int gateNumber;
    private GateType type;

    private Operator operator;

    public int getGateNumber() {
        return gateNumber;
    }

    public GateType getType() {
        return type;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
