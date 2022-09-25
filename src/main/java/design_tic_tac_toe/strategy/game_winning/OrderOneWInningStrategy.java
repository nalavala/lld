package design_tic_tac_toe.strategy.game_winning;

import design_tic_tac_toe.model.Board;
import design_tic_tac_toe.model.Player;
import design_tic_tac_toe.strategy.WinningStrategy;

public class OrderOneWInningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, Player symbol) {
        return false;
    }
}
