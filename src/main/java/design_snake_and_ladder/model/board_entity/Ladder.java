package design_snake_and_ladder.model.board_entity;

import design_snake_and_ladder.model.BoardEntity;
import design_snake_and_ladder.model.BoardEntityType;

public class Ladder extends BoardEntity {

    public Ladder(int from, int to) {
        super(BoardEntityType.LADDER, from, to);
    }
}
