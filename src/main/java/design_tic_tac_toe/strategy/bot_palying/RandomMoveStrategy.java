package design_tic_tac_toe.strategy.bot_palying;

import design_tic_tac_toe.model.Board;
import design_tic_tac_toe.model.Cell;
import design_tic_tac_toe.model.Player;
import design_tic_tac_toe.model.Move;
import design_tic_tac_toe.strategy.MakeMoveStrategy;

import java.util.List;

public class RandomMoveStrategy implements MakeMoveStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> cells : board.getCells()) {
            for(Cell cell : cells) {
                if(cell.isEmpty()) {
                    Move move = new Move();
                    move.setCell(cell);
                    move.setPlayer(player);
                    return move;
                }
            }
        }
        return null;
    }
}
