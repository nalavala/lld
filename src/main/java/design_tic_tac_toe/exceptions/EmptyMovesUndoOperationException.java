package design_tic_tac_toe.exceptions;

public class EmptyMovesUndoOperationException extends Exception {

    public EmptyMovesUndoOperationException() {
        super("Undo cant perform");
    }
}
