package design_parking_lot.model;

public class EntryGate extends Gate {
    private DisplayBoard displayBoard;


    public EntryGate(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }
}
