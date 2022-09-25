package design_tic_tac_toe.strategy;

import design_tic_tac_toe.model.Board;
import design_tic_tac_toe.model.Player;
import design_tic_tac_toe.model.Move;

public interface MakeMoveStrategy {

    Move makeMove(Board board, Player player);
}
