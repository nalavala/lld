package design_snake_and_ladder.model.board_entity;

import design_snake_and_ladder.model.BoardEntity;
import design_snake_and_ladder.model.BoardEntityType;

public class Snake extends BoardEntity {

    public Snake(int from, int to) {
        super(BoardEntityType.SNAKE, from, to);
    }
}
