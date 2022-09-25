package design_tic_tac_toe.exceptions;

public class MultipleBotException extends Exception {

    public MultipleBotException() {
        super("More than 1 bot present");
    }
}
