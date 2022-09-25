package design_tic_tac_toe.strategy;

import design_tic_tac_toe.model.Board;
import design_tic_tac_toe.model.Player;

public interface WinningStrategy {

    boolean checkWin(Board board, Player symbol);
}
