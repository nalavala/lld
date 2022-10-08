package design_snake_and_ladder.strategy;

import design_snake_and_ladder.model.BoardEntity;

import java.util.Set;

public interface BoardEntitiesGeneratorStrategy {

    BoardEntity generate(int boardSize, Set<Integer> exclude);
}
