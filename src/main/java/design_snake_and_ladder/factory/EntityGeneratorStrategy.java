package design_snake_and_ladder.factory;

import design_snake_and_ladder.model.BoardEntity;
import design_snake_and_ladder.model.BoardEntityType;
import design_snake_and_ladder.model.board_entity.Ladder;
import design_snake_and_ladder.strategy.BoardEntitiesGeneratorStrategy;
import design_snake_and_ladder.strategy.LadderGeneratorStrategy;
import design_snake_and_ladder.strategy.SnakeGeneratorStrategy;
import org.springframework.stereotype.Component;

@Component
public class EntityGeneratorStrategy {

    private LadderGeneratorStrategy ladderGeneratorStrategy;

    private SnakeGeneratorStrategy snakeGeneratorStrategy;

    public BoardEntitiesGeneratorStrategy getEntityStrategy(BoardEntityType type) {
        switch (type) {
            case SNAKE:
                return snakeGeneratorStrategy;
            case LADDER:
                return ladderGeneratorStrategy;
        }
        return null;
    }
}
