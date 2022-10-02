package design_snake_and_ladder.strategy;

import design_snake_and_ladder.model.Board;
import design_snake_and_ladder.model.Button;
import design_snake_and_ladder.model.Player;

public interface PlayerMoveStrategy {

    void move(Player player, Button button, int diceValue, Board board);
}
